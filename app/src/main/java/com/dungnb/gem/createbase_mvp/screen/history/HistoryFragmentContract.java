package com.dungnb.gem.createbase_mvp.screen.history;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentContract;

public interface HistoryFragmentContract {
  interface Presenter extends BaseFragmentContract.Presenter<View> {

  }

  interface View extends BaseFragmentContract.View<Presenter> {

  }
}
