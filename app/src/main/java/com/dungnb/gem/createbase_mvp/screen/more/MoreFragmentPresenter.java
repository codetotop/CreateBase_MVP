package com.dungnb.gem.createbase_mvp.screen.more;

import com.dungnb.gem.createbase_mvp.base.fragment.mvp.BaseFragmentContract;
import com.dungnb.gem.createbase_mvp.base.fragment.mvp.BaseFragmentPresenter;

public class MoreFragmentPresenter extends BaseFragmentPresenter<MoreFragmentContract.View> implements MoreFragmentContract.Presenter {
  @Override
  public MoreFragmentContract.View initView() {
    return new MoreFragment();
  }
}
