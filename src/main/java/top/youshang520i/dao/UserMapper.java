package top.youshang520i.dao;

import org.springframework.stereotype.Service;
import top.youshang520i.pojo.User;

import java.util.List;
@Service("userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    List<User> select();

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}