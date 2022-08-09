package com.zheng.controller;

import com.zheng.po.User;
import com.zheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: ZhengTianLiang
 * @date: 2022/08/09 22:51
 * @desc:
 */

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * @author: ZhengTianLiang
     * @date: 2022/08/09 23:02
     * @desc: 测试列表接口
     */
    @GetMapping("testList")
    public List<User> testList(){
        System.out.println("testList start ..");
        return userService.testList();
    }
}
