package com.pavelpotapov.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewNotes;
    private ArrayList<Note> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewNotes = findViewById(R.id.recyclerViewNotes);

        notes.add(new Note("Title 1", "Description 1", "Day 1", 1));
        notes.add(new Note("Title 2", "Description 2", "Day 2", 2));
        notes.add(new Note("Title 3", "Description 3", "Day 3", 3));
        notes.add(new Note("Title 4", "Description 4", "Day 4", 1));
        notes.add(new Note("Title 5", "Description 5", "Day 5", 2));
        notes.add(new Note("Title 6", "Description 6", "Day 6", 2));
        notes.add(new Note("Title 7", "Description 7", "Day 7", 1));

        NotesAdapter adapter = new NotesAdapter(notes);
        recyclerViewNotes.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewNotes.setAdapter(adapter);
    }
}