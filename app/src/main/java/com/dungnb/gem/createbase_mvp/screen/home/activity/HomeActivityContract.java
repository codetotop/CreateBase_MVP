package com.dungnb.gem.createbase_mvp.screen.home.activity;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.activity.BaseActivityContract;

public interface HomeActivityContract {
  interface HomeActivityView extends BaseActivityContract.View<HomeActivityPresenter> {

  }

  interface HomeActivityPresenter extends BaseActivityContract.Presenter<HomeActivityView> {

  }
}
