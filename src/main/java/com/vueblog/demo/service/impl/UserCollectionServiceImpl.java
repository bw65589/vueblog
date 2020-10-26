package com.vueblog.demo.service.impl;

import com.vueblog.demo.entity.UserCollection;
import com.vueblog.demo.mapper.UserCollectionMapper;
import com.vueblog.demo.service.UserCollectionService;
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
public class UserCollectionServiceImpl extends ServiceImpl<UserCollectionMapper, UserCollection> implements UserCollectionService {

}
