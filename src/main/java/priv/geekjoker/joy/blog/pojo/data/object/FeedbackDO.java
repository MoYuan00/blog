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
public class FeedbackDO {
    private Integer id;
    private Date createTime;
    private Date updateTime;
    private String content;
    private Integer  feedbackTypeId;
}
