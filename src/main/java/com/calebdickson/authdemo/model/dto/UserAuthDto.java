package com.calebdickson.authdemo.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserAuthDto {
    private String email;
    private String password;
}
