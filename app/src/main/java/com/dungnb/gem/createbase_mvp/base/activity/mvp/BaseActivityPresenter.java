package com.dungnb.gem.createbase_mvp.base.activity.mvp;

import android.content.Context;

public abstract class BaseActivityPresenter<V extends BaseActivityContract.View> implements BaseActivityContract.Presenter<V> {
  V view;

  @Override
  public V getView() {
    return view;
  }

  @Override
  public Context getContext() {
    return (Context) view;
  }

  @Override
  public void setView(V view) {
    this.view = view;
  }
}
