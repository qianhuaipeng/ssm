package com.soecode.lyf.dao;

import com.alibaba.fastjson.JSONObject;
import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * author: alan.peng
 * description:
 * date: create in 11:26 2018/3/8
 * modified By：
 */
public class UserDaoTest extends BaseTest{

    @Autowired
    private UserDao userDao;

    @Test
    public void testQueryById(){
        List<User> list = userDao.queryById(1);
        User user = list.get(0);
        System.out.println(user.getUserName());


        System.out.println(user.getCards().get(0).getCardNo());
    }

    @Test
    public void testQueryAll(){
        List<User> list = userDao.queryAll(0,10);
        User user = list.get(0);
        System.out.println(user.getUserName());
        System.out.println(user.getCards().get(0).getCardNo());

        String json = JSONObject.toJSONString(list);

        System.out.println(json);

    }
}
