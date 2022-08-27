package com.calebdickson.authdemo.mappers;

import com.calebdickson.authdemo.model.dto.UserRequestDto;
import com.calebdickson.authdemo.model.dto.UserResponseDto;
import com.calebdickson.authdemo.model.entities.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User requestDtoToEntity(UserRequestDto userRequestDto);

    UserResponseDto entityToResponseDto(User user);

}
