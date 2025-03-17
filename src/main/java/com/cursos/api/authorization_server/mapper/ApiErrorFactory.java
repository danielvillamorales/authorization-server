package com.cursos.api.authorization_server.mapper;


import com.cursos.api.authorization_server.dto.ApiError;
import jakarta.servlet.http.HttpServletRequest;

import java.time.LocalDateTime;

public final class ApiErrorFactory {

    private ApiErrorFactory() {
    }

    public static ApiError createApiError(String message, Exception e, HttpServletRequest request) {
        return ApiError.builder()
                .backendMessage(e.getLocalizedMessage())
                .path(request.getRequestURL().toString())
                .method(request.getMethod())
                .message(message)
                .timestamp(LocalDateTime.now())
                .build();
    }
}
