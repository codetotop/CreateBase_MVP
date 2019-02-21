package com.dungnb.gem.createbase_mvp.screen.history;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentPresenter;

public class HistoryFragmentPresenter extends BaseFragmentPresenter<HistoryFragmentContract.View> implements HistoryFragmentContract.Presenter {
  @Override
  public HistoryFragmentContract.View createView() {
    return new HistoryFragment();
  }
}
