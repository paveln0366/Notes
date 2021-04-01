package com.pavelpotapov.notes;

import android.app.Application;

import com.pavelpotapov.notes.di.AdapterModule;
import com.pavelpotapov.notes.di.AppComponent;
import com.pavelpotapov.notes.di.AppModule;
import com.pavelpotapov.notes.di.DaggerAppComponent;

import java.util.ArrayList;

import javax.inject.Inject;

public class App extends Application {
    private AppComponent appComponent;
//    @Inject ArrayList<Note> notes;

    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }

    private void initDagger() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .adapterModule(new AdapterModule())
                .build();
    }
}
