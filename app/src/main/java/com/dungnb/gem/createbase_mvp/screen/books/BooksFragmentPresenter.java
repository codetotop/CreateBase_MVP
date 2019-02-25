package com.dungnb.gem.createbase_mvp.screen.books;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentPresenter;

public class BooksFragmentPresenter extends BaseFragmentPresenter<BooksFragmentContract.View> implements BooksFragmentContract.Presenter {
  @Override
  public BooksFragmentContract.View createView() {
    return BooksFragment.getInstance();
  }
}
