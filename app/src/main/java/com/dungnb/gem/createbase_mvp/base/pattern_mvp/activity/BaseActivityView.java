package com.dungnb.gem.createbase_mvp.base.pattern_mvp.activity;

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

  protected void addOrReplaceChildrenFragment(int container_id, Fragment children_fragment, Bundle args, boolean add_to_back_stack, String tag) {
    if (args != null)
      children_fragment.setArguments(args);
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
    transaction.replace(container_id, children_fragment, tag);
    if (add_to_back_stack)
      transaction.addToBackStack(tag);
    transaction.commit();
  }

  protected void addOrShowChildrenFragment(int container_id, Fragment children_fragment, Bundle args, boolean add_to_back_stack, String tag) {
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    List<Fragment> fragments = manager.getFragments();
    if (fragments.isEmpty()) {
      addChildrenFragment(container_id, children_fragment, args, add_to_back_stack, tag);
    } else {
      Fragment fm = manager.findFragmentByTag(tag);
      for (Fragment fragment : fragments) {
        if (fragment != fm)
          transaction.hide(fragment);
      }
      if (fm != null)
        showChildrenFragment(fm);
      else {
        addChildrenFragment(container_id, children_fragment, args, add_to_back_stack, tag);
      }
    }
    transaction.commit();
  }

  protected void showChildrenFragment(Fragment children_fragment) {
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
    transaction.show(children_fragment);
    transaction.commit();
  }

  protected void addChildrenFragment(int container_id, Fragment children_fragment, Bundle args, boolean add_to_back_stack, String tag) {
    if (args != null)
      children_fragment.setArguments(args);
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
    transaction.add(container_id, children_fragment, tag);
    if (add_to_back_stack)
      transaction.addToBackStack(tag);
    transaction.commit();
  }
}
