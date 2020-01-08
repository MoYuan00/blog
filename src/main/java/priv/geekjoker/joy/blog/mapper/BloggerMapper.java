package priv.geekjoker.joy.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import priv.geekjoker.joy.blog.po.BloggerPO;

import java.util.List;

/**
 * @author -ZQ-
 */
@Mapper
public interface BloggerMapper {
    /**
     * 获取所有的博主信息
     * @return List<BloggerPO>
     */
    List<BloggerPO> listBlogger();
}
