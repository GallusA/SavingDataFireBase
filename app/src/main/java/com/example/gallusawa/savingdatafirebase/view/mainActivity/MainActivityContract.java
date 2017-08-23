package com.example.gallusawa.savingdatafirebase.view.mainActivity;

import com.example.gallusawa.savingdatafirebase.BasePresenter;
import com.example.gallusawa.savingdatafirebase.BaseView;

/**
 * Created by gallusawa on 8/22/17.
 */

public class MainActivityContract {

    interface View extends BaseView {
        void onDataSaved(boolean isSaved);
        void updateTextView();

    }

    interface Presenter extends BasePresenter<View> {

        void onDataSaved(boolean isSaved);

       void onGetSaved();
    }


}
