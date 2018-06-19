package com.monke.monkeybook.presenter;

import com.monke.basemvplib.IPresenter;

import java.io.File;
import java.util.List;

public interface IImportBookPresenter extends IPresenter{
    void searchLocationBook();

    void importBooks(List<File> books);
}
