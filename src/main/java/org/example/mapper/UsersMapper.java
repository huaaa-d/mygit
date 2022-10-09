package org.example.mapper;

import org.example.pojo.User;

public interface UsersMapper {

    //查找用户信息
    User findByNumber(String number);

    //添加用户信息
    int insertUser(User user);

    //删除用户信息
    int deleteUser(String number);

    //更改用户信息
    int updateUser(User user);


}
