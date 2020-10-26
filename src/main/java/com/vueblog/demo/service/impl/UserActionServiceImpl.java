package com.vueblog.demo.service.impl;

import com.vueblog.demo.entity.UserAction;
import com.vueblog.demo.mapper.UserActionMapper;
import com.vueblog.demo.service.UserActionService;
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
public class UserActionServiceImpl extends ServiceImpl<UserActionMapper, UserAction> implements UserActionService {

}
