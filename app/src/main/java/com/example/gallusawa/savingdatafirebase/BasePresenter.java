package com.example.gallusawa.savingdatafirebase;

/**
 * Created by gallusawa on 8/22/17.
 */

public interface BasePresenter<V extends  BaseView> {
    void attachView(V view);
    void detachView();

}
