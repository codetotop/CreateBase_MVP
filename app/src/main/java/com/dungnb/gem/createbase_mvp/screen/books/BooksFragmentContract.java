package com.dungnb.gem.createbase_mvp.screen.books;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentContract;

public interface BooksFragmentContract {
  interface View extends BaseFragmentContract.View<Presenter> {

  }

  interface Presenter extends BaseFragmentContract.Presenter<View> {

  }
}
