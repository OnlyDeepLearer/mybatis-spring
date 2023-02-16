package uz.dk.mybatis.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserRepository {

    Long insert(@Param("user") User user);

    User getById(@Param("id") Long id);

    List<User> getAll();

    void update(@Param("user") User user);

    void deleteById(@Param("id") Long id);

}
