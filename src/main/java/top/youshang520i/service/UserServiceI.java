package top.youshang520i.service;

import top.youshang520i.pojo.User;

import java.util.List;

public interface UserServiceI {
    int deleteByPrimaryKey(Long id);

    List<User> select();

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}