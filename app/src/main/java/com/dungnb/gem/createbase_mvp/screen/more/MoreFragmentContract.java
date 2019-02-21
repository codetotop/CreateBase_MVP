package com.dungnb.gem.createbase_mvp.screen.more;


import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentContract;

public interface MoreFragmentContract {
  interface View extends BaseFragmentContract.View<Presenter> {

  }

  interface Presenter extends BaseFragmentContract.Presenter<View> {

  }
}
