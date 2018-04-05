package com.example.elianxi_dengluzhuce.model;

import java.util.Map;

/**
 * Created by 石头 on 2018/4/5.
 */

public interface IModel {

    //登录
    void login(Map<String, String> map);

    //注册
    void reg(Map<String, String> map);

}
