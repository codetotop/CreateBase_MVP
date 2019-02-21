package com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragmentView<P extends BaseFragmentContract.Presenter> extends Fragment implements BaseFragmentContract.View<P> {
  P mPresenter;
  Unbinder mUnbinder;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(getLayoutResId(), container, false);
    mUnbinder = ButterKnife.bind(this, view);
    view.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

      }
    });
    return view;
  }

  protected abstract int getLayoutResId();

  @Override
  public void onResume() {
    super.onResume();
  }

  @Override
  public P getPresenter() {
    return mPresenter;
  }

  @Override
  public void onPause() {
    super.onPause();
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    mUnbinder.unbind();
  }

  @Override
  public Context getContext() {
    return getActivity();
  }

  @Override
  public P setPresenter(P presenter) {
    return this.mPresenter = presenter;
  }
}
