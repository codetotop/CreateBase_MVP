package com.dungnb.gem.createbase_mvp.screen.more;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentView;

public class MoreFragment extends BaseFragmentView<MoreFragmentContract.Presenter> implements MoreFragmentContract.View {
  @Override
  protected int getLayoutResId() {
    return R.layout.fragment_more;
  }
}
