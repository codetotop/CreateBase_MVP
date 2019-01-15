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
    mPresenter = initPresenter();
    if (mPresenter != null) {
      mPresenter.attachView(this);
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
      addChildrentFragment(listChildren, fragment, containerId, addToBackStack, tag);
    } else {
      Fragment fm = manager.findFragmentByTag(tag);

      for (Fragment fragment1 : listChildren) {
        if (fm != fragment1)
          transaction.hide(fragment1);
      }
      if (fm != null) {
        showChildrenFragment(listChildren, fm);
      } else {
        addChildrentFragment(listChildren, fragment, containerId, addToBackStack, tag);
      }
    }
    transaction.commit();
  }

  private void showChildrenFragment(List<Fragment> listChildren, Fragment fragment) {
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    transaction.show(fragment);
    transaction.commit();
  }

  private void addChildrentFragment(List<Fragment> listChildren, Fragment fragment, int ContainerId, boolean addToBackStack, String tag) {
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    transaction.add(ContainerId, fragment, fragment.getClass().getSimpleName());
    if (addToBackStack)
      transaction.addToBackStack(tag);
    transaction.commit();
  }
}
