/*
 * 文件名：UserEntity.java
 * 版权：Copyright by bonc
 * 描述：
 * 修改人：YuanPeng
 * 修改时间：2017年7月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.penta.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 用户实体类
 * @author Yuanpeng
 * @version 2017年7月3日
 * @see UserEntity
 * @since
 */

@Entity
public class UserEntity {
    
    /**
     * 用户id 
     */
    @Id
    private String uId;
    
    /**
     * 用户名
     */
    private String userName;
    
    /**
     * 年龄
     */
    private Integer age;
    
    /**
     * 地址
     */
    private String addr;

    
    public UserEntity(){
        
    }
    /**
     * 构造方法
     * @param uId
     * @param userName
     * @param age
     * @param addr
     */
    public UserEntity(String uId, String userName, Integer age, String addr) {
        super();
        this.uId = uId;
        this.userName = userName;
        this.age = age;
        this.addr = addr;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    
    
}
