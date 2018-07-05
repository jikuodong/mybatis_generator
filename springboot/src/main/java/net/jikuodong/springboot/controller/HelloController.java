package net.jikuodong.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName:    springboot
 * @Package:        net.jikuodong.springboot.controller
 * @ClassName:      HelloController
 * @Description:    java类作用描述: 测试springboot
 * @Author:         dongkuoji
 * @CreateDate:     2018/7/5 9:24
 * @UpdateUser:     dongkuoji
 * @UpdateDate:     2018/7/5 9:24
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello () {
        return "Hello spring Boot";
    }
}
