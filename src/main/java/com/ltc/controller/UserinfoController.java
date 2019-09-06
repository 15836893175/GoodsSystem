package com.ltc.controller;

import com.ltc.pojo.Userinfo;
import com.ltc.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;
    /*
    后台首页面跳转方法
     */
    @RequestMapping("/")
    public String login(){
        return "login";
    }

    /*
    后台登录方法
     */
    @RequestMapping("/login")
    public Userinfo loginuser(Userinfo user){
        Userinfo finduser = userinfoService.finduser(user);
        if (null!=finduser) {
            //TODO
            return finduser;
        }else {
            return null;
        }
    }
}
