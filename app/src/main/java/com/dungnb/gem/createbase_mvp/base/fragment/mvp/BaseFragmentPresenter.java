package com.dungnb.gem.createbase_mvp.base.fragment.mvp;

import android.content.Context;
import android.support.v4.app.Fragment;

public abstract class BaseFragmentPresenter<V extends BaseFragmentContract.View> implements BaseFragmentContract.Presenter<V> {
  V mView;


  public BaseFragmentPresenter() {
    mView = initView();
    mView.setPresenter(this);
  }

  @Override
  public V getView() {
    return mView;
  }

  @Override
  public Context getContext() {
    return mView.getMvpContext();
  }

  @Override
  public Fragment getFragment() {
    return (Fragment) mView;
  }
}
