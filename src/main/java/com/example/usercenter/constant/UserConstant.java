package com.example.usercenter.constant;

/**
 *
 * 用户常量
 *
 * @author yfl
 */
public interface UserConstant {

    /*
     * 加盐，混淆真实密码
     * */
    String SALT = "yfl";

    /*
     * 用户登录状态键
     * */
    String USER_LOGIN_STATE = "useLonginState";

    /**
     *管理权限
     *
     * 1 ------管理员
     * 2 ------普通用户(默认)
     */
    int ADMIN = 1;
    int ORDINARY_DEFAULT = 0;


}
