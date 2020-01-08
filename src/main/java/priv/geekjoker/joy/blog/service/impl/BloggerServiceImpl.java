package priv.geekjoker.joy.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.geekjoker.joy.blog.mapper.BloggerMapper;
import priv.geekjoker.joy.blog.po.BloggerPO;
import priv.geekjoker.joy.blog.service.BloggerService;

import java.util.List;

/**
 * @author -ZQ-
 */
@Service
public class BloggerServiceImpl implements BloggerService {

    @Autowired
    BloggerMapper bloggerMapper;


    @Override
    public List<BloggerPO> getAllBlogger() {
        return bloggerMapper.listBlogger();
    }
}
