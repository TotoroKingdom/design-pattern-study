package com.totoro.proxy;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public interface UserDao {

    @Select("select userName from user where id = #{id}")
    String queryUserInfo(String id);
}
