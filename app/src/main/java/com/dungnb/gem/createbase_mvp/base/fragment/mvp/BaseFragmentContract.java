package com.dungnb.gem.createbase_mvp.base.fragment.mvp;

import android.content.Context;

public interface BaseFragmentContract {
  interface Presenter<V extends View> {
    void initView(V view);

    V getView();

    Context getContext();
  }

  interface View<P extends Presenter> {
    P setPresenter();

    P getPresenter();
  }
}
