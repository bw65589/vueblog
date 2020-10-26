package com.vueblog.demo.service.impl;

import com.vueblog.demo.entity.Category;
import com.vueblog.demo.mapper.CategoryMapper;
import com.vueblog.demo.service.CategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
