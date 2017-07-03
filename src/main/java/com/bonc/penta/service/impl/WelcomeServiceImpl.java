/*
 * 文件名：WelcomeServiceImpl.java
 * 版权：Copyright by bonc
 * 描述：
 * 修改人：YuanPeng
 * 修改时间：2017年7月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.penta.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.bonc.penta.entity.UserEntity;
import com.bonc.penta.service.WelcomeService;

/**
 * WelcomeService的实现类
 * @author Yuanpeng
 * @version 2017年7月3日
 * @see WelcomeServiceImpl
 * @since
 */
@Service("welcomeService")
public class WelcomeServiceImpl implements WelcomeService{

    /**
     * 
     * Description: <br>
     * 测试方法
     * @param userName 
     * @return json
     * @see
     */
    public String sayHello(String userName) {
        UserEntity userEntity = new UserEntity("015303", userName, 200,"东方国信楼顶");
        String sayString = "欢迎光临" + userEntity.getUserName() + "同学";
        return JSON.toJSONString(sayString);
    }

}
