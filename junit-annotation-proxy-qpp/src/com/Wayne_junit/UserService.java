package com.Wayne_junit;

/*
    业务方法
*/
public class UserService {
    public String loginName(String loginName, String passWorld) {
        if ("admin".equals(loginName) && "123456".equals(passWorld)) {
            return "登录成功";
        } else {
            return "用户名或者密码有问题";
        }
    }

    public void selectNames() {
        System.out.println(10 / 2);
        System.out.println("查询全部用户名称成功");
    }


}
