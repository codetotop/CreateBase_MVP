package com.dungnb.gem.createbase_mvp.screen.home.fragment;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.base.fragment.mvp.BaseFragmentView;

public class HomeFragment extends BaseFragmentView<HomeFragmentContract.Presenter> implements HomeFragmentContract.View {

  @Override
  protected int getLayoutResId() {
    return R.layout.fragment_home;
  }
}
