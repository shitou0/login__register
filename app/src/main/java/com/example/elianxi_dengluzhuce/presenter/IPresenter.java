package com.example.elianxi_dengluzhuce.presenter;

import com.example.elianxi_dengluzhuce.model.IModel;
import com.example.elianxi_dengluzhuce.model.bean.RegBean;
import com.example.elianxi_dengluzhuce.model.bean.UserBean;
import com.example.elianxi_dengluzhuce.view.IMyView;
import com.example.elianxi_dengluzhuce.view.IRegView;

/**
 * Created by 石头 on 2018/4/5.
 */

public interface IPresenter {

//----------------------登陆------------------------------------------
    void LoginPresenter(IModel iModel, IMyView iMyView);
//    接受成功
    void getLogin(UserBean userBean);
    //接受失败的提示
    void getErrorData(String string);


//    --------------------注册---------------------------------------------------
    //注册
    void regPresenter(IModel iModel, IRegView iRegView);
    //接受注册成功参数
    void getReg(RegBean regBean);
    //接受注册失败的提示
    void getRegErrorData(String string);
}
