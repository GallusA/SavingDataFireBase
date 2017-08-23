package com.example.gallusawa.savingdatafirebase.Injection.MainActivity;

import com.example.gallusawa.savingdatafirebase.view.mainActivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gallusawa on 8/22/17.
 */
 @Module
public class MainActivityModule {
    @Provides
    MainActivityPresenter providesMainActivityPresenter(){
        return new MainActivityPresenter();
    }
}
