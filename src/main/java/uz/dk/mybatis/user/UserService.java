package uz.dk.mybatis.user;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.dk.mybatis.user.dto.UserCreateDto;
import uz.dk.mybatis.user.dto.UserDto;
import uz.dk.mybatis.user.dto.UserUpdateDto;

import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserMapper mapper;
    private final UserRepository repository;

    public UserService(@Qualifier("userMapperImpl") UserMapper mapper, UserRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public ResponseEntity<Long> create(UserCreateDto dto) {
        User user = mapper.fromCreateDto(dto);
        return new ResponseEntity<>(repository.insert(user), HttpStatus.OK);
    }

    public ResponseEntity<List<UserDto>> getAll() {
        List<User> userList = repository.getAll();
        return new ResponseEntity<>(mapper.toDto(userList), HttpStatus.OK);
    }

    public ResponseEntity<UserDto> get(Long id) {
        User user = repository.getById(id);
        return new ResponseEntity<>(mapper.toDto(user), HttpStatus.OK);
    }

    public ResponseEntity<Void> update(UserUpdateDto dto) {
        User user = mapper.fromUpdateDto(dto, repository.getById(dto.getId()));
        repository.update(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteById(Long id) {
        repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
