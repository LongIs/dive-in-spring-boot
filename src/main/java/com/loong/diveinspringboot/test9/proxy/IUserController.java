package com.loong.diveinspringboot.test9.proxy;

import com.loong.diveinspringboot.test7.old.UserVo;

public interface IUserController {

    UserVo login(String telephone, String password);

    UserVo register(String telephone, String password);

}
