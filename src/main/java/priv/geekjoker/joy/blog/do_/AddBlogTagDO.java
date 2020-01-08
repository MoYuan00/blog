package priv.geekjoker.joy.blog.do_;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author -ZQ-
 */
@Getter
@Setter
@ToString
public class AddBlogTagDO {
    private String blogId;
    private String tagId;
}
