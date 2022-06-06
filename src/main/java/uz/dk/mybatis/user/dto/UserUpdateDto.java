package uz.dk.mybatis.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateDto {
    private Long id;
    private String fullName;
    private int age;
    private String email;
    private String phoneNumber;
    private boolean isBlocked;
}
