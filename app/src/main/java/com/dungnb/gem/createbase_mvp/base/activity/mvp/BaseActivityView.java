package com.dungnb.gem.createbase_mvp.base.activity.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivityView<P extends BaseActivityContract.Presenter> extends FragmentActivity implements BaseActivityContract.View<P> {
  P mPresenter;
  private Unbinder mUnbinder;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutResId());
    mUnbinder = ButterKnife.bind(this);
    mPresenter = createPresenter();
    if (mPresenter != null) {
      mPresenter.setView(this);
    }

  }

  protected abstract int getLayoutResId();

  @Override
  protected void onResume() {
    super.onResume();
  }

  @Override
  public P getPresenter() {
    return mPresenter;
  }

  @Override
  protected void onPause() {
    super.onPause();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    mUnbinder.unbind();
  }

  protected void addOrShowChildrenFragment(Fragment fragment, int containerId, boolean addToBackStack, String tag) {
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    List<Fragment> listChildren = manager.getFragments();
    if (listChildren.isEmpty()) {
      addChildrenFragment(fragment, containerId, addToBackStack, tag);
    } else {
      Fragment fm = manager.findFragmentByTag(tag);

      for (Fragment fragment1 : listChildren) {
        if (fm != fragment1)
          transaction.hide(fragment1);
      }
      if (fm != null) {
        showChildrenFragment(fm);
      } else {
        addChildrenFragment(fragment, containerId, addToBackStack, tag);
      }
    }
    transaction.commit();
  }

  private void showChildrenFragment(Fragment fragment) {
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    transaction.show(fragment);
    transaction.commit();
  }

  private void addChildrenFragment(Fragment fragment, int containerId, boolean addToBackStack, String tag) {
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    transaction.add(containerId, fragment, tag);
    if (addToBackStack)
      transaction.addToBackStack(tag);
    transaction.commit();
  }
}
