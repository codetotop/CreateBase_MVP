package com.dungnb.gem.createbase_mvp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentContract;

import java.util.ArrayList;

public class BottomBarPagerAdapter extends FragmentStatePagerAdapter {
  ArrayList<BaseFragmentContract.Presenter> mPresenters;

  public BottomBarPagerAdapter(FragmentManager fm, ArrayList<BaseFragmentContract.Presenter> presenters) {
    super(fm);
    this.mPresenters = presenters;
  }

  @Override
  public Fragment getItem(int i) {
    return mPresenters.get(i).getFragment();
  }

  @Override
  public int getCount() {
    return mPresenters.size();
  }
}
