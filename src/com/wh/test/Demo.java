package com.wh.test;

import com.wh.Tool.Tool;
import com.wh.entily.User;
import com.wh.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;


import java.io.IOException;

import java.util.List;

public class Demo {

    public static void selectUser() throws IOException {
        //得到sqlsession会话对象
        SqlSession sqlSession = Tool.getSqlSession();
        //读取mapper接口的字节码文件，得到mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用方法进行sql语句的执行
        List<User> users = mapper.selectUser();
        for (User user:users) {
            System.out.println(user);
        }
        Tool.CloseSqlSession(sqlSession);
    }
    public  static void insertUser() throws IOException {
        SqlSession sqlSession = Tool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=new User(0,"周雅兰","女",18,18516541541l,"西南财经大学天府学院","经理","123");
        int i = mapper.insertUser(user);
        System.out.println(i);
        Tool.CloseSqlSession(sqlSession);
    }
    public static void selectUserById(int id) throws IOException {
        SqlSession sqlSession = Tool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectUserById(id);
        System.out.println(user.toString());
        Tool.CloseSqlSession(sqlSession);
    }
    public static void deleteUserById(int id) throws IOException {
        SqlSession sqlSession = Tool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUserById(id);
        System.out.println(i);
        Tool.CloseSqlSession(sqlSession);
    }
    public static  void updateUserById() throws IOException {
        SqlSession sqlSession = Tool.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=new User(20,"周雅兰","女",18,11111111111l,"西南财经大学天府学院","普通用户","123");
        int i = mapper.updateUser(user);
        System.out.println(i);
        Tool.CloseSqlSession(sqlSession);
    }


    public static void main(String[] args) throws IOException {
        updateUserById();
    }
}
