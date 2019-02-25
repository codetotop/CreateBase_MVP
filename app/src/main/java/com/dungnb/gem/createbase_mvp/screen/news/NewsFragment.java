package com.dungnb.gem.createbase_mvp.screen.news;

import com.dungnb.gem.createbase_mvp.R;
import com.dungnb.gem.createbase_mvp.base.pattern_mvp.fragment.BaseFragmentView;

public class NewsFragment extends BaseFragmentView<NewsFragmentContract.Presenter> implements NewsFragmentContract.View {
  @Override
  protected int getLayoutResId() {
    return R.layout.fragment_news;
  }
}
