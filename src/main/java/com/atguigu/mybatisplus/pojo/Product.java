package com.atguigu.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @author: 86152
 * @date: 2022/10/31 16:11
 * @description:
 */
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    @Version //标识乐观锁版本号字段
    private Integer version;
}