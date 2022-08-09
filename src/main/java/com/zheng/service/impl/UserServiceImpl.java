package com.zheng.service.impl;

import com.zheng.dao.UserDao;
import com.zheng.po.User;
import com.zheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: ZhengTianLiang
 * @date: 2022/08/09 22:51
 * @desc:
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * @author: ZhengTianLiang
     * @date: 2022/08/09 23:02
     * @desc: 测试列表接口
     */
    @Override
    public List<User> testList() {
        return userDao.selectList();
    }
}
