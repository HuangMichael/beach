package cn.linkbit.beach.controller.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
/**
 * Created by Administrator on 2016/4/22.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class LoginController {
    @RequestMapping("/")
    public String logout(HttpServletRequest request, ModelMap modelMap) {

        return "portal/index";
    }
}
