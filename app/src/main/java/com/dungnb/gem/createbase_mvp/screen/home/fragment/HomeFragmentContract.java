package com.dungnb.gem.createbase_mvp.screen.home.fragment;

import com.dungnb.gem.createbase_mvp.base.fragment.mvp.BaseFragmentContract;

public interface HomeFragmentContract {
  interface HomePresenter extends BaseFragmentContract.Presenter<HomeView> {

  }

  interface HomeView extends BaseFragmentContract.View<HomePresenter> {

  }
}
