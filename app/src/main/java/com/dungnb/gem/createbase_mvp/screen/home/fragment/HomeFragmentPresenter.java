package com.dungnb.gem.createbase_mvp.screen.home.fragment;

import com.dungnb.gem.createbase_mvp.base.fragment.mvp.BaseFragmentPresenter;

public class HomeFragmentPresenter extends BaseFragmentPresenter<HomeFragmentContract.View> implements HomeFragmentContract.Presenter {

  @Override
  public HomeFragmentContract.View createView() {
    return new HomeFragment();
  }
}
