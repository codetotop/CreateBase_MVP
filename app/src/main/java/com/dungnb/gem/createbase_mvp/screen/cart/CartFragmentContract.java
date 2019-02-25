package com.dungnb.gem.createbase_mvp.screen.cart;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentContract;

public interface CartFragmentContract {
  interface View extends BaseFragmentContract.View<Presenter> {

  }

  interface Presenter extends BaseFragmentContract.Presenter<View> {

  }
}
