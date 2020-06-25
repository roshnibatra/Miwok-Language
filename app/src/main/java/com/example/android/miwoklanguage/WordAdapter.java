package com.example.android.miwoklanguage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

   private int mColorResourceId;

   public WordAdapter(Activity Context,ArrayList<Word> words,int colorResourceId) {
       super(Context,0, words);
       mColorResourceId=colorResourceId;
   }

    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        Word currentWord = getItem(position);

       View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView defaultImageView = listItemView.findViewById(R.id.image_view);
        if(currentWord.hasImage()) {

            defaultImageView.setImageResource(currentWord.getImageResource());
            defaultImageView.setVisibility(View.VISIBLE);
        } else {
            defaultImageView.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}

