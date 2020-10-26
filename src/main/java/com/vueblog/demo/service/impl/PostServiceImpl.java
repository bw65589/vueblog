package com.vueblog.demo.service.impl;

import com.vueblog.demo.entity.Post;
import com.vueblog.demo.mapper.PostMapper;
import com.vueblog.demo.service.PostService;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

}
