package com.example.usercenter;

import com.example.usercenter.mapper.UserMapper;
import com.example.usercenter.model.domain.User;
import jakarta.annotation.Resource;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@SpringBootTest
public class SampleTest {

    @Resource
    private UserMapper userMapper;

    //加密测试
    @Test
    public void testDigest() throws NoSuchAlgorithmException{
        String newPassword = DigestUtils.md5DigestAsHex(("abc" + "myPassword").getBytes());
        System.out.println(newPassword);
    }

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.isTrue(5 == userList.size(), "");
        userList.forEach(System.out::println);
    }

}