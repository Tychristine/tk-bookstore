package com.prprv.shop.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 订单表信息
 */
@Data
@TableName(value = "order")
public class Order implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @TableId
    private long id;
    private long orderNo;
    private long userId;
    private long orderItemId;
    private double payment;
    private Integer postage;
    private Integer status;
    private Date paymentTime;
    private Date sendTime;
    private Date endTime;
    private Date closeTime;
    private Date createTime;
    private Date updateTime;
    private Integer isDeleted;
}
