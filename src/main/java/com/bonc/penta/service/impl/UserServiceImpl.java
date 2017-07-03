/*
 * 文件名：UserServiceImpl.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年7月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.penta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonc.penta.dao.UserEntityDao;
import com.bonc.penta.entity.UserEntity;
import com.bonc.penta.service.UserService;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Hello World
 * @version 2017年7月3日
 * @see UserServiceImpl
 * @since
 */

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    UserEntityDao userEntityDao;
    
    /* (non-Javadoc)
     * @see com.bonc.penta.service.UserService#userSave(java.lang.String)
     */
    public void userSave() {
        UserEntity userEntity1 = new UserEntity("010101","姓名1", 20, "北京");
        UserEntity userEntity2 = new UserEntity("010102","姓名2", 21, "北京");
        UserEntity userEntity3 = new UserEntity("010103","姓名3", 22, "北京");
        userEntityDao.save(userEntity1);
        userEntityDao.save(userEntity2);
        userEntityDao.save(userEntity3);
    }

    
}
