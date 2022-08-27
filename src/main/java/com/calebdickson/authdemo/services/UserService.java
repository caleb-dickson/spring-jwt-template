package com.calebdickson.authdemo.services;

import com.calebdickson.authdemo.model.dto.UserRequestDto;
import com.calebdickson.authdemo.model.dto.UserResponseDto;

public interface UserService {
    UserResponseDto createUser(UserRequestDto userRequestDto);
}
