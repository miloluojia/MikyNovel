package com.monke.monkeybook.presenter;

import com.monke.basemvplib.IPresenter;
import java.util.LinkedHashMap;

public interface ILibraryPresenter extends IPresenter{

    LinkedHashMap<String, String> getKinds();

    void getLibraryData();
}
