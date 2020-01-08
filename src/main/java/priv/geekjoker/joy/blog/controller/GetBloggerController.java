package priv.geekjoker.joy.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import priv.geekjoker.joy.blog.po.BloggerPO;
import priv.geekjoker.joy.blog.service.BloggerService;

import java.util.List;

/**
 * @author -ZQ-
 */
@RestController
public class GetBloggerController {

    @Autowired
    BloggerService bloggerService;

    @RequestMapping("/allBlogger")
    @ResponseBody
    public List<BloggerPO> exec(){
        return bloggerService.getAllBlogger();
    }
}
