package com.dungnb.gem.createbase_mvp.screen.news;

import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentPresenter;

public class NewsFragmentPresenter extends BaseFragmentPresenter<NewsFragmentContract.View> implements NewsFragmentContract.Presenter {
  @Override
  public NewsFragmentContract.View createView() {
    return new NewsFragment();
  }
}
