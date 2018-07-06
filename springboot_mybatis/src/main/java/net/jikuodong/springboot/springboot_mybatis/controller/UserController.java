package net.jikuodong.springboot.springboot_mybatis.controller;

import net.jikuodong.springboot.springboot_mybatis.po.User;
import net.jikuodong.springboot.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

    @Controller
    @RequestMapping(value = "/user")
    public class UserController {
        @Autowired
        private UserService userService;

        @ResponseBody
        @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
        public int addUser(User user){
            return userService.addUser(user);
        }

        @ResponseBody
        @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
        public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

            return userService.findAllUser(pageNum,pageSize);
        }
    }
