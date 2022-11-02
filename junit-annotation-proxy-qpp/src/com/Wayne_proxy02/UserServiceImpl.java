package com.Wayne_proxy02;

public class UserServiceImpl implements UserService {
    @Override
    public String login(String loginName, String passWord) {
        long startTime = System.currentTimeMillis();
        String rs = "登录名和密码错误";
        if ("admin".equals(loginName) && "123456".equals(passWord)) {
            rs = "登陆成功";
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public void deleteUsers() {
        try {
            System.out.println("您正在删除用户数据中");
            Thread.sleep(2500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String selectUsers() {
        String rs = "查询了10000个用户数据";
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    @Override
    public void deldteById(int id) {
        try {
            System.out.println("根据用户的身份证号码：" + id + "删除了它");
            Thread.sleep(1200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
