package com.dungnb.gem.createbase_mvp.screen.home.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.base.activity.mvp.BaseActivityView;
import com.dungnb.gem.createbase_mvp.screen.home.fragment.HomeFragment;
import com.dungnb.gem.createbase_mvp.screen.home.fragment.HomeFragmentPresenter;

public class HomeActivity extends BaseActivityView<HomeActivityContract.HomeActivityPresenter> implements HomeActivityContract.HomeActivityView {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addOrShowChildrenFragment(new HomeFragmentPresenter().getFragment(), R.id.container, false, HomeFragment.class.getSimpleName());
  }

  @Override
  protected int getLayoutResId() {
    return R.layout.activity_home;
  }

  @Override
  public HomeActivityContract.HomeActivityPresenter initPresenter() {
    return new HomeActivityPresenter();
  }


}
