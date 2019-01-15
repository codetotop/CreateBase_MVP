package com.dungnb.gem.createbase_mvp.screen.history;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.base.fragment.mvp.BaseFragmentView;

public class HistoryFragment extends BaseFragmentView<HistoryFragmentContract.Presenter> implements HistoryFragmentContract.View {
  @Override
  protected int getLayoutResId() {
    return R.layout.fragment_history;
  }
}
