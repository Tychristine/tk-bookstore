package com.prprv.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.prprv.shop.model.entity.Cart;
import com.prprv.shop.model.vo.CartVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 未確認の庭師
 */
@Repository
public interface CartMapper extends BaseMapper<Cart> {
}
