package com.zheng.dao;

import com.zheng.po.User;
import java.util.List;

/**
 * @author: ZhengTianLiang
 * @date: 2022/08/09 22:54
 * @desc:
 */
public interface UserDao {

    /**
     * @author: ZhengTianLiang
     * @date: 2022/08/09 23:09
     * @desc: 测试列表接口
     */
    List<User> selectList();
}
