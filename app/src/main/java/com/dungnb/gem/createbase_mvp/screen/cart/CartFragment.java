package com.dungnb.gem.createbase_mvp.screen.cart;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentView;

public class CartFragment extends BaseFragmentView<CartFragmentContract.Presenter> implements CartFragmentContract.View {
  static CartFragment mInstance;

  public static CartFragment getInstance() {
    if (mInstance == null)
      mInstance = new CartFragment();
    return mInstance;
  }

  @Override

  protected int getLayoutResId() {
    return R.layout.fragment_cart;
  }
}
