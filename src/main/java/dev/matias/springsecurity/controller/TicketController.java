package dev.matias.springsecurity.controller;

import dev.matias.springsecurity.controller.dto.*;
import dev.matias.springsecurity.entities.Ticket;
import dev.matias.springsecurity.entities.Tweet;
import dev.matias.springsecurity.repository.TicketRepository;
import dev.matias.springsecurity.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@RestController
public class TicketController {

    private final UserRepository userRepository;
    private final TicketRepository ticketRepository;

    public TicketController(UserRepository userRepository, TicketRepository ticketRepository) {
        this.userRepository = userRepository;
        this.ticketRepository = ticketRepository;
    }

    @GetMapping("/ticket")
    public ResponseEntity<GetTicketDto> tickets(@RequestParam(value = "page", defaultValue = "0") int page,
                                        @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {

        var tickets = ticketRepository.findAll(
                        PageRequest.of(page, pageSize, Sort.Direction.DESC, "createdAt"))
                .map(ticket ->
                        new GetItemTicketDto(
                                ticket.getTicketId(),
                                ticket.getUser().getUsername(),
                                ticket.getTitle(),
                                ticket.getContent(),
                                ticket.getStatus(),
                                ticket.getPriority(),
                                ticket.getCategory(),
                                ticket.isRemoteAccessAllowed(),
                                ticket.getCreatedAt(),
                                ticket.getUpdatedAt(),
                                ticket.getResolvedAt(),
                                ticket.getAssignedTo() != null ? ticket.getAssignedTo().getUsername() : null
                        )
                );
        return ResponseEntity.ok(new GetTicketDto(
                tickets.getContent(), page, pageSize, tickets.getTotalPages(), tickets.getTotalElements()));
    }

    @PostMapping("/ticket")
    public ResponseEntity<Void> createTicket(@RequestBody CreateTicketDto dto,
                                            JwtAuthenticationToken token) {
        var user = userRepository.findById(UUID.fromString(token.getName()));

        var ticket = new Ticket();
        ticket.setUser(user.get());
        ticket.setTitle(dto.title());
        ticket.setContent(dto.content());
        ticket.setStatus("OPEN");
        ticket.setPriority(dto.priority());
        ticket.setCategory(dto.category());
        ticket.setRemoteAccessAllowed(dto.remoteAccessAllowed());
        ticket.setCreatedAt(new Date());
        ticketRepository.save(ticket);

        return ResponseEntity.ok().build();
    }
}
