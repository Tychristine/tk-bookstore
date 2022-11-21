package com.prprv.shop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.prprv.shop.mapper.UserMapper;
import com.prprv.shop.model.entity.User;
import com.prprv.shop.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @projectName: tk-bookstore
 * @package: com.prprv.shop.service.impl
 * @className: UserDetailsServiceImpl
 * @author: phj233
 * @date: 2022/11/21 15:46
 * @version: 1.0
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,username);
        User user = userMapper.selectOne(queryWrapper);
        if (Objects.isNull(user)) throw new UsernameNotFoundException("用户名或密码错误");
        return new LoginService(user);
    }
}
