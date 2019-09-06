package com.ltc.mapper;

import com.ltc.pojo.Userinfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserinfoMapper {
    //用户登录方法
    Userinfo finduser(Userinfo user);
}
