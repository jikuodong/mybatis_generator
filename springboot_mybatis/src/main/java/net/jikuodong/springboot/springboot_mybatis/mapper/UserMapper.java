package net.jikuodong.springboot.springboot_mybatis.mapper;

import net.jikuodong.springboot.springboot_mybatis.po.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    //这个方式我自己加的
    List<User> selectAllUser();
}