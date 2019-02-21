package com.dungnb.gem.createbase_mvp.screen.more;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentPresenter;

public class MoreFragmentPresenter extends BaseFragmentPresenter<MoreFragmentContract.View> implements MoreFragmentContract.Presenter {
  @Override
  public MoreFragmentContract.View createView() {
    return new MoreFragment();
  }
}
