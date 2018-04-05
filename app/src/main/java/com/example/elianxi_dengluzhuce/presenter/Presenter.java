package com.example.elianxi_dengluzhuce.presenter;

import com.example.elianxi_dengluzhuce.model.IModel;
import com.example.elianxi_dengluzhuce.model.bean.RegBean;
import com.example.elianxi_dengluzhuce.model.bean.UserBean;
import com.example.elianxi_dengluzhuce.view.IMyView;
import com.example.elianxi_dengluzhuce.view.IRegView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 石头 on 2018/4/5.
 */

public class Presenter implements IPresenter {

    private IMyView iMyView;
    private IRegView iRegView;

    @Override
    public void LoginPresenter(IModel iModel, IMyView iMyView) {
        this.iMyView = iMyView;
        Map<String, String> map = new HashMap<>();
        map.put("mobile", iMyView.getMobile());
        map.put("password", iMyView.getPassword());
        iModel.login(map);

    }

    //登陆成功
    @Override
    public void getLogin(UserBean userBean) {
        iMyView.loginSuccess();
    }

    //登陆失败
    @Override
    public void getErrorData(String string) {
        iMyView.loginError(string);
    }

    @Override
    public void regPresenter(IModel iModel, IRegView iRegView) {
        this.iRegView=iRegView;
        Map<String, String> map = new HashMap<>();
        map.put("mobile", iRegView.getMobile());
        map.put("password", iRegView.getPassword());
        iModel.reg(map);
    }

    @Override
    public void getReg(RegBean regBean) {
        iRegView.register();
    }

    @Override
    public void getRegErrorData(String string) {
        iRegView.regError(string);
    }
}
