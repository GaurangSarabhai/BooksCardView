package com.example.bookscardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {


    List<Menu> lstBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lstBook = new ArrayList<>();
        lstBook.add(new Menu("ASM", R.drawable.asm));
        lstBook.add(new Menu("Chief Mate",R.drawable.chief));
        lstBook.add(new Menu("2MFG",R.drawable.mfg ));
        lstBook.add(new Menu("Cadet",R.drawable.cadet));
        lstBook.add(new Menu("Video Links",R.drawable.video));
        lstBook.add(new Menu("Morse Code",R.drawable.morse));
        lstBook.add(new Menu("About Us",R.drawable.bg));
        lstBook.add(new Menu("Share",R.drawable.bg));


        RecyclerView myRecyclerView= findViewById(R.id.homeRecyclerView_id);
       // RecyclerViewAdapter myAdapter= new RecyclerViewAdapter(this,lstBook);
        homeRecyclerViewAdapter myAdapter= new homeRecyclerViewAdapter(this,lstBook);
        myRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        myRecyclerView.setAdapter(myAdapter);
    }
}
