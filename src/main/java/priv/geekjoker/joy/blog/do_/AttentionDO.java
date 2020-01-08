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
public class AttentionDO {
    private String id;
    private String name;
    private String address;
    private Date addTime;
    private String explain;
}
