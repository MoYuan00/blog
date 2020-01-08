package priv.geekjoker.joy.blog.mapper;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BloggerMapperTest {

    @Autowired
    BloggerMapper bloggerMapper;

    @Test
    public void listBlogger() {
        System.out.println(bloggerMapper.listBlogger());
    }
}