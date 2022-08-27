package com.calebdickson.authdemo.services.impl;

import com.calebdickson.authdemo.mappers.UserMapper;
import com.calebdickson.authdemo.model.dto.UserRequestDto;
import com.calebdickson.authdemo.model.dto.UserResponseDto;
import com.calebdickson.authdemo.repositories.UserRepository;
import com.calebdickson.authdemo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        return userMapper.entityToResponseDto(
                userRepository.saveAndFlush(
                        userMapper.requestDtoToEntity(userRequestDto)));
    }
}
