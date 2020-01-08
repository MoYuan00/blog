package priv.geekjoker.joy.blog.service;

import priv.geekjoker.joy.blog.po.BloggerPO;

import java.util.List;

/**
 * @author -ZQ-
 */
public interface BloggerService {
    /**
     * 获取所有的博主信息
     * @return List<BloggerPO>
     */
    List<BloggerPO> getAllBlogger();
}
