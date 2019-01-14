package com.dungnb.gem.createbase_mvp.base.activity.mvp;

import android.content.Context;

public interface BaseActivityContract {
  interface Presenter<V extends View> {
    V getView();

    Context getContext();

    void attachView(V view);

  }

  interface View<P extends Presenter> {
    P getPresenter();

    P initPresenter();

  }
}
