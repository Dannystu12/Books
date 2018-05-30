package com.example.danielstewart.books;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Intent intent = getIntent();
        Book book = (Book) intent.getSerializableExtra("book");

        TextView title = findViewById(R.id.title);
        title.setText(book.getTitle());

        TextView author = findViewById(R.id.author);
        author.setText(book.getAuthor());

        TextView year = findViewById(R.id.year);
        year.setText(Integer.toString(book.getYear()));

    }
}
