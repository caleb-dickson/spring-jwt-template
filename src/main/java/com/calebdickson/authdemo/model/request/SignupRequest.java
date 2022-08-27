package com.calebdickson.authdemo.model.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SignupRequest {
    private String username;

    private String email;

    private String password;
}
