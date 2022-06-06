package uz.dk.mybatis.user;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.dk.mybatis.user.dto.UserCreateDto;
import uz.dk.mybatis.user.dto.UserDto;
import uz.dk.mybatis.user.dto.UserUpdateDto;

import java.util.List;


@Component
@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {

    UserDto toDto(User user);

    List<UserDto> toDto(List<User> users);

    User fromCreateDto(UserCreateDto createDto);

    User fromUpdateDto(UserUpdateDto updateDto);

    User fromUpdateDto(UserUpdateDto updateDto, @MappingTarget User user);

}

