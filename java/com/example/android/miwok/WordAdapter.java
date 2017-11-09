package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Daniel on 11/6/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    public WordAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTranslationTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokTranslationTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTranslationTextView = (TextView) listItemView.findViewById(R.id.english_word);
        defaultTranslationTextView.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }

}