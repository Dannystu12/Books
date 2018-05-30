package com.example.danielstewart.books;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);


        Books books = new Books();
        List<Book> booksList = books.getBooks();

        BookAdapter adapter = new BookAdapter(this, booksList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showBook(view);
            }
        });
    }

    public void showBook(View v){
        Book book = (Book) v.getTag();
        Intent intent = new Intent(this, BookActivity.class);
        intent.putExtra("book", book);
        startActivity(intent);
    }
}
