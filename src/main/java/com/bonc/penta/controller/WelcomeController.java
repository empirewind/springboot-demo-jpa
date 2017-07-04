/*
 * 文件名：WelcomeController.java
 * 版权：Copyright by bonc
 * 描述：
 * 修改人：YuanPeng
 * 修改时间：2017年7月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.penta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bonc.penta.service.UserService;
import com.bonc.penta.service.WelcomeService;

/**
 * WelcomeController控制器
 * @author YuanPeng
 * @version 2017年7月3日
 * @see WelcomeController
 * @since
 */

@Controller
public class WelcomeController {

    /**
     * WelcomeService接口
     */
    @Autowired
    @Qualifier("welcomeService")
    private WelcomeService welcomeService;
    
    /**
     * UserService 接口
     */
    @Autowired
    @Qualifier("userService")
    private UserService userService;
    
    /**
     * 
     * Description: <br>
     * 进入
     * @return "welcome/index"
     * @see
     */
    @RequestMapping(value={"/", "/inter"})
    public String inter(){
        //在数据库中初始化用户
        userService.userSave();
        
        return "welcome/index";
    }
    
    /**
     * 
     * Description: <br>
     * sayHello的控制器
     * @param userName   
     * @return JSON
     * @see
     */
    @RequestMapping(value={"/v1/sayHello"}, method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(String userName){

        String sayString = welcomeService.sayHello(userName);
        return sayString;
    }
}
