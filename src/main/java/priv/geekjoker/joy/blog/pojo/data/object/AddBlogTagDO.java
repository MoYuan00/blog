package priv.geekjoker.joy.blog.pojo.data.object;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author -ZQ-
 */
@Getter
@Setter
@ToString
public class AddBlogTagDO {
    private Integer id;
    private Date creatTime;
    private Date updateTime;
    private Integer blogId;
    private Integer tagId;
}
