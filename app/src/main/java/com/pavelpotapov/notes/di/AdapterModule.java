package com.pavelpotapov.notes.di;

import android.content.Context;

import com.pavelpotapov.notes.Note;
import com.pavelpotapov.notes.NotesAdapter;

import java.util.ArrayList;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AdapterModule {

    @Provides
    @Singleton
    public ArrayList<Note> provideArrayListNote() {
        ArrayList<Note> notes = new ArrayList<>();
        return notes;
    }

    @Provides
    @Singleton
    public NotesAdapter provideNotesAdapter(ArrayList<Note> notes, Context context) {
        return new NotesAdapter(notes, context);
    }
}
