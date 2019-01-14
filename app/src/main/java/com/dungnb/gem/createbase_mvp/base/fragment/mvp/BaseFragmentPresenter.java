package com.dungnb.gem.createbase_mvp.base.fragment.mvp;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.dungnb.gem.createbase_mvp.base.activity.mvp.BaseActivityContract;

public abstract class BaseFragmentPresenter<V extends BaseFragmentContract.View> implements BaseFragmentContract.Presenter<V> {
  V view;

  @Override
  public V getView() {
    return view;
  }

  @Override
  public Context getContext() {
    return (Context) view;
  }


}
