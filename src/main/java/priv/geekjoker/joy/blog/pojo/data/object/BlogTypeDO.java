package priv.geekjoker.joy.blog.pojo.data.object;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author -ZQ-
 */
@Setter
@Getter
@ToString
public class BlogTypeDO {
    private Integer id;
    private Date createTime;
    private Date updateTime;
    private String name;
}
