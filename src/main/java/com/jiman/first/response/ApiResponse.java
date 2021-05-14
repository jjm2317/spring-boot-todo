package com.jiman.first.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.sql.Timestamp;


@ToString
public class ApiResponse {
    private Timestamp timestamp;
    private int status;
    private String error;
    private String message;
    private String path;

    public ApiResponse(int status, String error, String message) {
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getRequestURI();
    }
}
