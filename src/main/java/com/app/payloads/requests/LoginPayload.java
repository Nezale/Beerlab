package com.app.payloads.requests;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class LoginPayload {
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
