package com.monke.monkeybook.view;

import com.monke.basemvplib.IView;

public interface IBookDetailView extends IView{
    /**
     * 更新书籍详情UI
     */
    void updateView();

    /**
     * 数据获取失败
     */
    void getBookShelfError();
}
