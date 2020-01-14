package priv.geekjoker.joy.blog.mapper.simple;

import org.springframework.stereotype.Repository;
import priv.geekjoker.joy.blog.pojo.data.object.BloggerDO;

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
