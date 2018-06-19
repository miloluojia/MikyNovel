package com.monke.monkeybook.view;

import com.monke.basemvplib.IView;
import com.monke.monkeybook.bean.SearchBookBean;
import com.monke.monkeybook.view.adapter.ChoiceBookAdapter;
import java.util.List;

public interface IChoiceBookView extends IView{

    void refreshSearchBook(List<SearchBookBean> books);

    void loadMoreSearchBook(List<SearchBookBean> books);

    void refreshFinish(Boolean isAll);

    void loadMoreFinish(Boolean isAll);

    void searchBookError();

    void addBookShelfSuccess(List<SearchBookBean> searchBooks);

    void addBookShelfFailed(int code);

    ChoiceBookAdapter getSearchBookAdapter();

    void updateSearchItem(int index);

    void startRefreshAnim();
}
