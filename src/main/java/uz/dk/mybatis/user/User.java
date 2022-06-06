package uz.dk.mybatis.user;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
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
