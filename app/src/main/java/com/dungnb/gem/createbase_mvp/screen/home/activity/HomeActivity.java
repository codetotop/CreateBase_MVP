package com.dungnb.gem.createbase_mvp.screen.home.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.base.activity.mvp.BaseActivityView;
import com.dungnb.gem.createbase_mvp.screen.home.fragment.HomeFragment;
import com.dungnb.gem.createbase_mvp.screen.home.fragment.HomeFragmentPresenter;

import butterknife.BindView;

public class HomeActivity extends BaseActivityView<HomeActivityContract.HomeActivityPresenter> implements HomeActivityContract.HomeActivityView, BottomNavigationView.OnNavigationItemSelectedListener {

  @BindView(R.id.bottomBarView)
  BottomNavigationView mBottomNavigationView;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mBottomNavigationView.setOnNavigationItemSelectedListener(this);

  }

  @Override
  protected int getLayoutResId() {
    return R.layout.activity_home;
  }

  @Override
  public HomeActivityContract.HomeActivityPresenter initPresenter() {
    return new HomeActivityPresenter();
  }

  @Override
  public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
    switch (menuItem.getItemId()) {
      case R.id.menuHome:
        addOrShowChildrenFragment(new HomeFragmentPresenter().getFragment(), R.id.container, false, HomeFragment.class.getSimpleName());
        break;
      case R.id.menuHistory:
        break;
      case R.id.menuMore:
        break;
      default:
        break;
    }
    return false;
  }
}
