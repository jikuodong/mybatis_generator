package net.jikuodong.springboot.springboot_mybatis.service;

import net.jikuodong.springboot.springboot_mybatis.po.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
