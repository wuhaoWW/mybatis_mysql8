package com.wh.mapper;

import com.wh.entily.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUserDT(User user);
    int insertUser(User user);
    int deleteUserById(int id);
    int updateUser(User user);
    List<User> SelectNumber(List list);
}
