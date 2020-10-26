package com.vueblog.demo.service.impl;

import com.vueblog.demo.entity.Comment;
import com.vueblog.demo.mapper.CommentMapper;
import com.vueblog.demo.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bw
 * @since 2020-10-26
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
