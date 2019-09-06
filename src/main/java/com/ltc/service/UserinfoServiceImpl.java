package com.ltc.service;

import com.ltc.mapper.UserinfoMapper;
import com.ltc.pojo.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoServiceImpl implements UserinfoService{
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public Userinfo finduser(Userinfo user) {
        Userinfo loginuser = userinfoMapper.finduser(user);
        if (null!=loginuser) {
            return loginuser;
        }else {
            System.out.println("service异常");
            return null;
        }
    }
}
