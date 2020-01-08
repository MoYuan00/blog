package priv.geekjoker.joy.blog.do_;


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
public class BlogDO {
    private String id;
    private String title;
    private String text;
    private Date postedTime;
    private Date updatedTime;
    private String blogTypeId;
}
