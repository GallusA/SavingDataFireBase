package com.example.gallusawa.savingdatafirebase.view.mainActivity;

import android.util.Log;


import com.example.gallusawa.savingdatafirebase.Injection.MainActivity.DaggerMainActivityComponent;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Ref;

/**
 * Created by gallusawa on 8/22/17.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {



    private static final String TAG = "MainActivityPresenter";

    MainActivityContract.View view;
    public com.example.gallusawa.savingdatafirebase.Injection.MainActivity.DaggerMainActivityComponent DaggerMainActivityComponent;

    public void attachView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }


    @Override
    public void onDataSaved(boolean isSaved) {
        view.onDataSaved(true);
    }

    @Override
    public void onGetSaved() {

    }

    public void saveDataToCloud(String s) {

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue(s);



        view.onDataSaved(true);

        Log.d(TAG, "saveDataToCloud: ");
    }


}

