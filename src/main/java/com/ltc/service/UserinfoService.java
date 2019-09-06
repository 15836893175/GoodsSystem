package com.ltc.service;

import com.ltc.pojo.Userinfo;
import org.springframework.stereotype.Service;

public interface UserinfoService {
    //用户登录方法
    Userinfo finduser(Userinfo user);
}
