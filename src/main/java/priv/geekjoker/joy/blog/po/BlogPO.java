package priv.geekjoker.joy.blog.po;


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
public class BlogPO {
    private String id;
    private String title;
    private String text;
    private Date postedTime;
    private Date updatedTime;
    private String blogTypeId;
}
