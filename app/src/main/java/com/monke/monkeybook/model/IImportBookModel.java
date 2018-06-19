package com.monke.monkeybook.model;

import com.monke.monkeybook.bean.LocBookShelfBean;
import java.io.File;
import io.reactivex.Observable;

public interface IImportBookModel {

    Observable<LocBookShelfBean> importBook(File book);
}
