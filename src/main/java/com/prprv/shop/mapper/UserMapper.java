package com.prprv.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.prprv.shop.model.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 未確認の庭師
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    User selectUserByLogin(
            @Param("email") String email,
            @Param("password") String password
    );
}
