package com.dungnb.gem.createbase_mvp.screen.home.fragment;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentContract;

public interface HomeFragmentContract {
  interface Presenter extends BaseFragmentContract.Presenter<View> {

  }

  interface View extends BaseFragmentContract.View<Presenter> {

  }
}
