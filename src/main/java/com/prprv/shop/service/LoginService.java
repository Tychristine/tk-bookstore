package com.prprv.shop.service;

import com.prprv.shop.mapper.UserMapper;
import com.prprv.shop.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @projectName: tk-bookstore
 * @package: com.prprv.shop.service
 * @className: LoginService
 * @author: phj233
 * @date: 2022/11/21 15:51
 * @version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginService implements UserDetails {
    @Autowired
    private User user;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
