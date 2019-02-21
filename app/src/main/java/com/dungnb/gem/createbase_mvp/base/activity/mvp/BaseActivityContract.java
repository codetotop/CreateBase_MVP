package com.dungnb.gem.createbase_mvp.base.activity.mvp;

import android.content.Context;

public interface BaseActivityContract {
  interface Presenter<V extends View> {
    V getView();

    void setView(V view);

    Context getContext();
  }

  interface View<P extends Presenter> {
    P getPresenter();

    P createPresenter();
  }
}
