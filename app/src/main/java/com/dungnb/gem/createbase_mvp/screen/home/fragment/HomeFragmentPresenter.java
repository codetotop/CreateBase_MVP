package com.dungnb.gem.createbase_mvp.screen.home.fragment;

import android.support.v4.app.Fragment;

import com.dungnb.gem.createbase_mvp.base.fragment.mvp.BaseFragmentPresenter;

public class HomeFragmentPresenter extends BaseFragmentPresenter<HomeFragmentContract.HomeView> implements HomeFragmentContract.HomePresenter {

  @Override
  public HomeFragmentContract.HomeView initView() {
    return new HomeFragment();
  }
}
