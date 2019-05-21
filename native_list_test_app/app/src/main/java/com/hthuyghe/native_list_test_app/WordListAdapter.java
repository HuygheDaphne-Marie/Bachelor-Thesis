package com.hthuyghe.native_list_test_app;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WordListAdapter extends RecyclerView.Adapter<WordListItemHolder> {

    String[] words = {};

    @NonNull
    @Override
    public WordListItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.word_list_item, viewGroup);
        return new WordListItemHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListItemHolder viewHolder, int i) {
        viewHolder.setData(words[i]);
    }

    @Override
    public int getItemCount() {
        return words.length;
    }

    public void setWords(String[] words) {
        this.words = words;
    }
}
