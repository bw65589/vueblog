package com.vueblog.demo.service.impl;

import com.vueblog.demo.entity.Blog;
import com.vueblog.demo.mapper.BlogMapper;
import com.vueblog.demo.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bw
 * @since 2020-09-06
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
