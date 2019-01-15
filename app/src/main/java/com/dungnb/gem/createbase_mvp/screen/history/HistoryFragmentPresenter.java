package com.dungnb.gem.createbase_mvp.screen.history;

import com.dungnb.gem.createbase_mvp.base.fragment.mvp.BaseFragmentPresenter;

public class HistoryFragmentPresenter extends BaseFragmentPresenter<HistoryFragmentContract.View> implements HistoryFragmentContract.Presenter {
  @Override
  public HistoryFragmentContract.View initView() {
    return new HistoryFragment();
  }
}
