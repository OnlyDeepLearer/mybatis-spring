package uz.dk.mybatis;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition // http://localhost:8080/swagger-ui/index.html
public class MyBatisApplication {

    // Examples MyBatis query's
    // https://mybatis.org/mybatis-3/dynamic-sql.html

    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class, args);
    }

}
