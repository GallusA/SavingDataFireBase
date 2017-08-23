package com.example.gallusawa.savingdatafirebase.Injection.MainActivity;

import com.example.gallusawa.savingdatafirebase.view.mainActivity.MainActivity;

import dagger.Component;

/**
 * Created by gallusawa on 8/22/17.
 */
@Component(modules = MainActivityModule.class)

public interface MainActivityComponent {

    void inject (MainActivity mainActivity);
}
