package com.example.gallusawa.savingdatafirebase.view.mainActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.gallusawa.savingdatafirebase.Injection.MainActivity.DaggerMainActivityComponent;
import com.example.gallusawa.savingdatafirebase.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{
    private static final String TAG = "MainActivity";
    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupDaggerComponent();
        presenter.attachView(this);
        presenter.saveDataToCloud("John Doe");


        DaggerMainActivityComponent.create().inject(this);

    }

    private void setupDaggerComponent() {
        DaggerMainActivityComponent.create().inject(this);
    }

    @Override
    public void showerror(String error) {

    }



    @Override
    public void onDataSaved(boolean isSaved) {
        Log.d(TAG, "onDataSaved: " + isSaved);
    }

    @Override
    public void updateTextView() {

    }

    public void GetData(View view) {

    }


}
