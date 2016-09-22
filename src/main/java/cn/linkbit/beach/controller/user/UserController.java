package cn.linkbit.beach.controller.user;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 用户控制器类
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {



    @RequestMapping(value = "/list")
    public String list() {

        return "/user/user_content";
    }
}
