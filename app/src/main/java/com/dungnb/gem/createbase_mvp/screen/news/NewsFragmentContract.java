package com.dungnb.gem.createbase_mvp.screen.news;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentContract;

public interface NewsFragmentContract {
  interface Presenter extends BaseFragmentContract.Presenter<View> {

  }

  interface View extends BaseFragmentContract.View<Presenter> {

  }
}
