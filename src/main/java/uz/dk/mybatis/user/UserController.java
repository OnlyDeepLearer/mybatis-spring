package uz.dk.mybatis.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.dk.mybatis.user.dto.UserCreateDto;
import uz.dk.mybatis.user.dto.UserDto;
import uz.dk.mybatis.user.dto.UserUpdateDto;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<Long> create(@RequestBody UserCreateDto dto) {
        return service.create(dto);
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> get(@PathVariable Long id) {
        return service.get(id);
    }

//    boolean a = true;
//    @PostMapping("/obke")
//    public ResponseEntity<Void> responseEntity() {
//        if (a){
//            a = false;
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//        else {
//            a = true;
//            return new ResponseEntity<>(HttpStatus.ACCEPTED);
//        }
//
//    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody UserUpdateDto dto) {
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return service.deleteById(id);
    }

}
