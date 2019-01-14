package com.dungnb.gem.createbase_mvp.screen.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.base.activity.mvp.BaseActivityView;
import com.dungnb.gem.createbase_mvp.screen.home.activity.HomeActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivityView<LoginContract.LoginPresenter> implements LoginContract.LoginView {
  @BindView(R.id.edtUserName)
  EditText mEdtUserName;
  @BindView(R.id.edtPassWord)
  EditText mEdtPassWord;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  protected int getLayoutResId() {
    return R.layout.activity_main;
  }

  @Override
  public LoginContract.LoginPresenter initPresenter() {
    return new LoginPresenterPresenter();
  }

  @OnClick(R.id.btnLogin)
  void login() {
    getPresenter().login(mEdtUserName.getText().toString(), mEdtPassWord.getText().toString());
  }

  @Override
  public void setUserFailure() {
    Toast.makeText(this, "User name is Empty", Toast.LENGTH_SHORT).show();
  }

  @Override
  public void setPassWordFailure() {
    Toast.makeText(this, "Pass word is Empty", Toast.LENGTH_SHORT).show();
  }

  @Override
  public void loginSuccess() {
    Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show();
    Intent intent = new Intent(this, HomeActivity.class);
    startActivity(intent);
  }
}
