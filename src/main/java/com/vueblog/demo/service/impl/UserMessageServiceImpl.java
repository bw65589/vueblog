package com.vueblog.demo.service.impl;

import com.vueblog.demo.entity.UserMessage;
import com.vueblog.demo.mapper.UserMessageMapper;
import com.vueblog.demo.service.UserMessageService;
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
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements UserMessageService {

}
