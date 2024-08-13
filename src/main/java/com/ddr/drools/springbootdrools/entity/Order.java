package com.ddr.drools.springbootdrools.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Order {
    private int amout; //订单金额
    private int score;// 积分
}