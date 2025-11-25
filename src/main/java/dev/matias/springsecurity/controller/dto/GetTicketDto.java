package dev.matias.springsecurity.controller.dto;

import java.util.List;

public record GetTicketDto(List<GetItemTicketDto> ticketItens,
                           int page,
                           int pageSize,
                           int totalPages,
                           long totalElements){
}
