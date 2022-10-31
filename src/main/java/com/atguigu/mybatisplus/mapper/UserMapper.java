package com.atguigu.mybatisplus.mapper;
import java.util.List;

import com.atguigu.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author: 86152
 * @date: 2022/10/30 15:14
 * @description:
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据id查询用户信息为map集合
     * @param id
     * @return
     */
    Map<String, Object> selectMapById(Long id);


    Page<User> selectPageVo(@Param("page") Page<User> page, @Param("age") Integer i);

}
