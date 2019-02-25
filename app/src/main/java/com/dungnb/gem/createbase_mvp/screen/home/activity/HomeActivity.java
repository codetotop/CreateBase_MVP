package com.dungnb.gem.createbase_mvp.screen.home.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.adapter.BottomBarPagerAdapter;
import com.dungnb.gem.createbase_mvp.base.pattern_mvp.activity.BaseActivityView;
import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentContract;
import com.dungnb.gem.createbase_mvp.screen.books.BooksFragmentPresenter;
import com.dungnb.gem.createbase_mvp.screen.cart.CartFragmentPresenter;
import com.dungnb.gem.createbase_mvp.screen.news.NewsFragmentPresenter;
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
    addControls();
  }

  private void addControls() {

    mBottomBarPagerAdapter = new BottomBarPagerAdapter(getSupportFragmentManager(), getPresenters());
    mViewPager.setAdapter(mBottomBarPagerAdapter);
    mViewPager.setOffscreenPageLimit(5);
    mBottomNavigationView.setupWithViewPager(mViewPager, true);
    mUnderlinePageIndicator.setViewPager(mViewPager, 0);
  }

  private ArrayList<BaseFragmentContract.Presenter> getPresenters() {
    ArrayList<BaseFragmentContract.Presenter> presenters = new ArrayList<>();
    presenters.add(new HomeFragmentPresenter());
    presenters.add(new NewsFragmentPresenter());
    presenters.add(new CartFragmentPresenter());
    presenters.add(new BooksFragmentPresenter());
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
}
