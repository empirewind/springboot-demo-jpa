/*
 * 文件名：UserEntityDao.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年7月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.penta.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.bonc.penta.entity.UserEntity;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Hello World
 * @version 2017年7月3日
 * @see UserEntityDao
 * @since
 */

@Transactional
public interface UserEntityDao extends  CrudRepository<UserEntity, Long>{

    /**
     * 
     * Description: <br>
     * 通过用户名查询 （spring data jpa 创建方法名进行简单查询 ）
     * @param username  
     * @return List<UserEntity>
     * @see
     */
    List<UserEntity> findByUserName(String username);
}
