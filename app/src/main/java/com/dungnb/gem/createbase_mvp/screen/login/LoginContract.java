package com.dungnb.gem.createbase_mvp.screen.login;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.activity.BaseActivityContract;

public interface LoginContract {
  interface LoginPresenter extends BaseActivityContract.Presenter<LoginView> {
    void login(String userName, String passWorking);
  }

  interface LoginView extends BaseActivityContract.View<LoginPresenter> {
    void setUserFailure();

    void setPassWordFailure();

    void loginSuccess();
  }
}
