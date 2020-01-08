package priv.geekjoker.joy.blog.service;

import priv.geekjoker.joy.blog.do_.BloggerDO;

import java.util.List;

/**
 * @author -ZQ-
 */
public interface BloggerService {
    /**
     * 获取所有的博主信息
     * @return List<BloggerDO>
     */
    List<BloggerDO> getAllBlogger();
}
