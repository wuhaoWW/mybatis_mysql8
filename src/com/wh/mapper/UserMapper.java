package com.wh.mapper;

import com.wh.entily.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
    int insertUser(User user);
    User selectUserById(int id);
    int deleteUserById(int id);
    int updateUser(User user);
}
