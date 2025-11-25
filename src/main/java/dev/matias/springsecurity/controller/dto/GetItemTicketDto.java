package dev.matias.springsecurity.controller.dto;



import java.util.Date;

public record GetItemTicketDto(long ticketId,String username, String title, String content, String status,
                               String priority, String category, boolean remoteAccessAllowed, Date createdAt,
                               Date updatedAt, Date resolvedAt, String username_assined_by) {

}
