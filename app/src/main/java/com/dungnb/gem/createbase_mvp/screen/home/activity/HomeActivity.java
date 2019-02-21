package com.dungnb.gem.createbase_mvp.screen.home.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.base.pattern_mvp.activity.BaseActivityView;
import com.dungnb.gem.createbase_mvp.screen.history.HistoryFragment;
import com.dungnb.gem.createbase_mvp.screen.history.HistoryFragmentPresenter;
import com.dungnb.gem.createbase_mvp.screen.home.fragment.HomeFragment;
import com.dungnb.gem.createbase_mvp.screen.home.fragment.HomeFragmentPresenter;
import com.dungnb.gem.createbase_mvp.screen.more.MoreFragment;
import com.dungnb.gem.createbase_mvp.screen.more.MoreFragmentPresenter;

import butterknife.BindView;

public class HomeActivity extends BaseActivityView<HomeActivityContract.HomeActivityPresenter> implements HomeActivityContract.HomeActivityView, BottomNavigationView.OnNavigationItemSelectedListener {

  @BindView(R.id.bottomBarView)
  BottomNavigationView mBottomNavigationView;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    onNavigationFragment(R.id.menuHome);
    mBottomNavigationView.setOnNavigationItemSelectedListener(this);
  }

  @Override
  protected int getLayoutResId() {
    return R.layout.activity_home;
  }

  @Override
  public HomeActivityContract.HomeActivityPresenter createPresenter() {
    return new HomeActivityPresenter();
  }

  @Override
  public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
    onNavigationFragment(menuItem.getItemId());
    return false;
  }

  private void onNavigationFragment(int itemId) {
    switch (itemId) {
      case R.id.menuHome:
        addOrShowChildrenFragment(R.id.container, new HomeFragmentPresenter().getFragment(), null, false, HomeFragment.class.getSimpleName());
        break;
      case R.id.menuHistory:
        addOrShowChildrenFragment(R.id.container, new HistoryFragmentPresenter().getFragment(), null, false, HistoryFragment.class.getSimpleName());
        break;
      case R.id.menuMore:
        addOrShowChildrenFragment(R.id.container, new MoreFragmentPresenter().getFragment(), null, false, MoreFragment.class.getSimpleName());
        break;
      default:
        break;
    }
  }
}
