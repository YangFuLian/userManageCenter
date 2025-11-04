package com.example.usercenter.service;

import com.example.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
 * 用户服务
 *
 * @author 旗木
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2025-07-22 11:39:25
 */
public interface UserService extends IService<User> {

    /**
     *用户注册
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 验证码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账号
     * @param userPassword 用户密码
     * @return 用户信息(脱敏)
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     *
     * 用户信息脱敏
     * @param originUser
     * @return 处理后的user用户
     */
    User getSafetyUser(User originUser);
}
