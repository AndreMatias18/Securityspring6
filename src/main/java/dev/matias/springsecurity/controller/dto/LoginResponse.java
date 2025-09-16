package dev.matias.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
