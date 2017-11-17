package com.mappers;

import com.models.User;
//import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

//    @Select("SELECT id, username, password, role FROM users WHERE username = #{username} LIMIT 1")
    User findByUsername(String username);

//    @Insert("INSERT INTO users(username, password, role) VALUES(#{username}, #{password}, #{role} ) ")
    void insertUser(User user);
}