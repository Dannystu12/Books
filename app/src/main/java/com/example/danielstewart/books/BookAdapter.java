package com.example.danielstewart.books;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, List<Book>book){
        super(context, 0 ,book);
    }

    @Override
    public View getView(int position, View bookView, ViewGroup parent){

        if(bookView == null){
            bookView = LayoutInflater.from(getContext())
                    .inflate(R.layout.book_list_item, parent, false);
        }

        Book book = getItem(position);

        TextView year = bookView.findViewById(R.id.year);
        year.setText(Integer.toString(book.getYear()));

        TextView title = bookView.findViewById(R.id.title);
        title.setText(book.getTitle());

        TextView author = bookView.findViewById(R.id.author);
        author.setText(book.getAuthor());

        bookView.setTag(book);

        return bookView;
    }
}
