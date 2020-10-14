package com.vueblog.demo.service.impl;

import com.vueblog.demo.entity.User;
import com.vueblog.demo.mapper.UserMapper;
import com.vueblog.demo.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
