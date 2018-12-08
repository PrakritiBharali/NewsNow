package com.example.android.newsnow;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> news){
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        News currentNews = getItem(position);

        //Title
        String title = currentNews.getTitle();
        TextView titleView = listItemView.findViewById(R.id.title);
        titleView.setText(title);

        //Section
        String section = currentNews.getSection();
        TextView sectionView = listItemView.findViewById(R.id.section);
        sectionView.setText(section);

        //Date
        String dateAndTime = currentNews.getDate();
        String date;
        String[] parts = dateAndTime.split("T");
        date = parts[0];
        TextView dateView = listItemView.findViewById(R.id.date);
        dateView.setText(date);

        //Author
        String author = currentNews.getAuthor();
        TextView authorView = listItemView.findViewById(R.id.author);
        authorView.setText(author);
        return listItemView;
    }
}
