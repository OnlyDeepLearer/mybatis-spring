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


//    @Results(id = "UserMap", value = {
//            @Result(property = "companyId", column = "company_id"),
//            @Result(property = "name", column = "user_name"),
//            @Result(property = "email", column = "user_email"),
//            @Result(property = "phone", column = "user_phone"),
//            @Result(property = "address", column = "user_address")
//    })
//    @Select("<script>SELECT * FROM User <if test='keyword != null'>WHERE user_name like CONCAT( '%', CONCAT( #{keyword}, '%' ))</if> <if test='orderBy != null'>ORDER BY ${orderBy}</if></script>")
//    List<User> getByKeyword(@Param("keyword") String keyword, @Param("orderBy") String orderBy);
}
