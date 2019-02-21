package com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

public interface BaseFragmentContract {
  interface Presenter<V extends View> {
    V createView();

    V getView();

    Fragment getFragment();

    Context getContext();
  }

  interface View<P extends Presenter> {
    P setPresenter(P presenter);

    P getPresenter();

    Context getContext();
  }
}
