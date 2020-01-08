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
public class AdminPO {
    private String id;
    private String name;
    private Date createTime;
}
