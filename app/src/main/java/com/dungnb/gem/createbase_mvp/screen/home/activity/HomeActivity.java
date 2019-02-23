package com.dungnb.gem.createbase_mvp.screen.home.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.adapter.BottomBarPagerAdapter;
import com.dungnb.gem.createbase_mvp.base.pattern_mvp.activity.BaseActivityView;
import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentContract;
import com.dungnb.gem.createbase_mvp.screen.history.HistoryFragmentPresenter;
import com.dungnb.gem.createbase_mvp.screen.home.fragment.HomeFragmentPresenter;
import com.dungnb.gem.createbase_mvp.screen.more.MoreFragmentPresenter;
import com.dungnb.gem.createbase_mvp.widget.MenuNavigationView;
import com.viewpagerindicator.UnderlinePageIndicator;

import java.util.ArrayList;

import butterknife.BindView;

public class HomeActivity extends BaseActivityView<HomeActivityContract.HomeActivityPresenter> implements HomeActivityContract.HomeActivityView {

  @BindView(R.id.vpHome)
  ViewPager mViewPager;
  @BindView(R.id.bottomBarView)
  MenuNavigationView mBottomNavigationView;
  @BindView(R.id.underlinePageIndicator)
  UnderlinePageIndicator mUnderlinePageIndicator;
  BottomBarPagerAdapter mBottomBarPagerAdapter;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //onNavigationFragment(R.id.menuHome);
    //mBottomNavigationView.setOnNavigationItemSelectedListener(this);
    addControls();
  }

  private void addControls() {

    mBottomBarPagerAdapter = new BottomBarPagerAdapter(getSupportFragmentManager(), getPresenters());
    mViewPager.setAdapter(mBottomBarPagerAdapter);
    mViewPager.setOffscreenPageLimit(4);
    mBottomNavigationView.setupWithViewPager(mViewPager, true);
    mUnderlinePageIndicator.setViewPager(mViewPager, 0);
  }

  private ArrayList<BaseFragmentContract.Presenter> getPresenters() {
    ArrayList<BaseFragmentContract.Presenter> presenters = new ArrayList<>();
    presenters.add(new HomeFragmentPresenter());
    presenters.add(new HistoryFragmentPresenter());
    presenters.add(new HomeFragmentPresenter());
    presenters.add(new MoreFragmentPresenter());

    return presenters;
  }

  @Override
  protected int getLayoutResId() {
    return R.layout.activity_home;
  }

  @Override
  public HomeActivityContract.HomeActivityPresenter createPresenter() {
    return new HomeActivityPresenter();
  }

  /*@Override
  public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
    onNavigationFragment(menuItem.getItemId());
    return false;
  }

  private void onNavigationFragment(int itemId) {
    switch (itemId) {
      case R.id.menuHome:
        addOrShowChildrenFragment(R.id.container, new HomeFragmentPresenter().getFragment(), null, false, HomeFragment.class.getSimpleName());
        break;
      case R.id.menuNews:
        addOrShowChildrenFragment(R.id.container, new HistoryFragmentPresenter().getFragment(), null, false, HistoryFragment.class.getSimpleName());
        break;
      case R.id.menuMore:
        addOrShowChildrenFragment(R.id.container, new MoreFragmentPresenter().getFragment(), null, false, MoreFragment.class.getSimpleName());
        break;
      default:
        break;
    }
  }*/
}
