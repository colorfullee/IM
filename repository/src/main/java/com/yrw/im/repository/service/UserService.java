package com.yrw.im.repository.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yrw.im.common.domain.User;

/**
 * Date: 2019-04-07
 * Time: 18:35
 *
 * @author yrw
 */
public interface UserService extends IService<User> {

    /**
     * 验证用户密码，成功则返回用户，失败返回null
     *
     * @param username 用户名
     * @param pwdSha   密码SHA512
     * @return
     */
    User verifyAndGet(String username, String pwdSha);

    /**
     * 保存用户
     *
     * @param username 用户名
     * @param pwdSha   密码SHA512
     * @return
     */
    Long saveUser(String username, String pwdSha);
}