package priv.geekjoker.joy.blog.mapper;

import org.springframework.stereotype.Repository;
import priv.geekjoker.joy.blog.do_.BloggerDO;

import java.util.List;

/**
 * @author -ZQ-
 */
@Repository
public interface BloggerMapper {
    /**
     * 获取所有的博主信息
     * @return List<BloggerDO>
     */
    List<BloggerDO> listBlogger();
}
