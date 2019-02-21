package com.dungnb.gem.createbase_mvp.screen.login;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.activity.BaseActivityPresenter;

public class LoginPresenterPresenter extends BaseActivityPresenter<LoginContract.LoginView> implements LoginContract.LoginPresenter {

  @Override
  public void login(String userName, String passWorking) {
    boolean error = false;
    if (userName.isEmpty()) {
      error = true;
      getView().setUserFailure();
    } else if (passWorking.isEmpty()) {
      error = true;
      getView().setPassWordFailure();
    }

    if (!error)
      getView().loginSuccess();
  }
}
