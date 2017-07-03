/*
 * 文件名：webApplication.java
 * 版权：Copyright by bonc
 * 描述：
 * 修改人：Yuanpeng
 * 修改时间：2017年7月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.penta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot应用启动入口类
 * 
 * @author Yuanpeng
 * @version 2017年7月3日
 * @see webApplication
 * @since 1.0
 */

@SpringBootApplication
public class WebApplication {

    /**
     * Description: <br>
     * SpringBoot应用启动入口
     * @param args 
     * @see 
     */
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
