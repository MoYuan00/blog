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
public class CollectionPO {
    private String id;
    private String content;
    private String sourceAddress;
    private String title;
    private Date addTime;
}
