package uz.dk.mybatis.user;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String fullName;
    private int age;
    private String email;
    private String phoneNumber;
    private Date createAt;
    private boolean isBlocked;
    private boolean isDeleted;
}
