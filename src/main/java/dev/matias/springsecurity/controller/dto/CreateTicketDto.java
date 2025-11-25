package dev.matias.springsecurity.controller.dto;

public record CreateTicketDto(
        String title,
        String content,
        String priority,
        String category,
        boolean remoteAccessAllowed
){}

// priorizar apenas passar pelos dtos a informação front , ou seja nada de passar id , datas etc... isso é trabalho dos
// triggeres no back-end
