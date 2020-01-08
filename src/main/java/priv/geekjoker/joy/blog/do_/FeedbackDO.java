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
public class FeedbackDO {
    private String id;
    private String content;
    private Date postedTime;
    private String  feedbackTypeId;
}
