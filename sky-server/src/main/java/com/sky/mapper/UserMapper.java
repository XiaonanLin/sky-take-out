package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * @author HANAYO
 * @description
 * @create 2025/10/21 22:06
 */
@Mapper
public interface UserMapper {
    /**
     * 根据openid查询用户
     * @param id
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String id);

    /**
     * 插入数据
     * @param user
     */
    void insert(User user);

    /**
     * 根据id查询用户
     * @param userId
     * @return
     */
    @Select("select * from user where id = #{id};")
    User getById(Long userId);

    /**
     * 根据begin和end日期查询用户数量
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
