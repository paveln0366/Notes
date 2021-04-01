package com.pavelpotapov.notes.di;

import com.pavelpotapov.notes.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class, AdapterModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
