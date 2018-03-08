package com.soecode.lyf.dao;

import com.soecode.lyf.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * author: alan.peng
 * description:
 * date: create in 10:54 2018/3/8
 * modified By：
 */
public interface UserDao {

    List<User> queryById(int id);

    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    int update();
}
