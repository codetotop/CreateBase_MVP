package com.dungnb.gem.createbase_mvp.screen.books;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentContract;
import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentView;

public class BooksFragment extends BaseFragmentView<BooksFragmentContract.Presenter> implements BooksFragmentContract.View {
  static BooksFragment mInstance;

  public static BooksFragment getInstance() {
    if (mInstance == null)
      mInstance = new BooksFragment();
    return mInstance;
  }

  @Override
  protected int getLayoutResId() {
    return R.layout.fragment_books;
  }
}
