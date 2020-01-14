package priv.geekjoker.joy.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author -ZQ-
 */
@SpringBootApplication
@MapperScan(basePackages = {"priv.geekjoker.joy.blog.mapper.simple"})
public class JoyBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoyBlogApplication.class, args);
    }

}
