package com.dungnb.gem.createbase_mvp.screen.cart;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentPresenter;


public class CartFragmentPresenter extends BaseFragmentPresenter<CartFragmentContract.View> implements CartFragmentContract.Presenter {
  @Override
  public CartFragmentContract.View createView() {
    return CartFragment.getInstance();
  }
}
