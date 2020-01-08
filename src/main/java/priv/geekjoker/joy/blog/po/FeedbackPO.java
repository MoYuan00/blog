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
public class FeedbackPO {
    private String id;
    private String content;
    private Date postedTime;
    private String  feedbackTypeId;
}