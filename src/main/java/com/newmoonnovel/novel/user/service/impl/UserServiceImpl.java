package com.newmoonnovel.novel.user.service.impl;

import com.newmoonnovel.novel.user.pojo.User;
import com.newmoonnovel.novel.user.mapper.UserMapper;
import com.newmoonnovel.novel.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author longw
 * @since 2021-03-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
