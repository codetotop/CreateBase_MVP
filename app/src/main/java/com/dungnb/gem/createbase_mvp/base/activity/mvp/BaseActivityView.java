package com.dungnb.gem.createbase_mvp.base.activity.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivityView<P extends BaseActivityContract.Presenter> extends FragmentActivity implements BaseActivityContract.View<P> {
  P mPresenter;
  private Unbinder mUnbinder;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutResId());
    mUnbinder = ButterKnife.bind(this);
    mPresenter = initPresenter();
    if (mPresenter != null) {
      mPresenter.attachView(this);
    }
  }

  protected abstract int getLayoutResId();

  @Override
  protected void onResume() {
    super.onResume();
  }

  @Override
  public P getPresenter() {
    return mPresenter;
  }

  @Override
  protected void onPause() {
    super.onPause();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    mUnbinder.unbind();
  }
}
