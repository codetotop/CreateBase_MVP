package com.dungnb.gem.createbase_mvp.screen.history;

import com.dungnb.gem.createbase_mvp.base.fragment.mvp.BaseFragmentContract;

public interface HistoryFragmentContract {
  interface Presenter extends BaseFragmentContract.Presenter<View> {

  }

  interface View extends BaseFragmentContract.View<Presenter> {

  }
}
