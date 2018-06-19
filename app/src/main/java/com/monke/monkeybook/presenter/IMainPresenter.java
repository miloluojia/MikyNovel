package com.monke.monkeybook.presenter;

import com.monke.basemvplib.IPresenter;

public interface IMainPresenter extends IPresenter{
    void queryBookShelf(Boolean needRefresh);
}
