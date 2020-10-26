package com.vueblog.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author bw
 * @since 2020-10-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_user_action")
public class UserAction implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 动作类型
     */
    private String action;

    /**
     * 得分
     */
    private Integer point;

    /**
     * 关联的帖子ID
     */
    private String postId;

    /**
     * 关联的评论ID
     */
    private String commentId;

    private LocalDateTime created;

    private LocalDateTime modified;


}
