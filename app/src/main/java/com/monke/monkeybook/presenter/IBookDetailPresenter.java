package com.monke.monkeybook.presenter;

import com.monke.basemvplib.IPresenter;
import com.monke.monkeybook.bean.BookShelfBean;
import com.monke.monkeybook.bean.SearchBookBean;

public interface IBookDetailPresenter extends IPresenter{

    int getOpenfrom();

    SearchBookBean getSearchBook();

    BookShelfBean getBookShelf();

    Boolean getInBookShelf();

    void getBookShelfInfo();

    void addToBookShelf();

    void removeFromBookShelf();
}
