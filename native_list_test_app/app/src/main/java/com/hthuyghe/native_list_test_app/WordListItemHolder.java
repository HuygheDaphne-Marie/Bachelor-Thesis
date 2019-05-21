package com.hthuyghe.native_list_test_app;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class WordListItemHolder extends RecyclerView.ViewHolder {

    TextView tvWord;
    String word;

    public WordListItemHolder(@NonNull View itemView) {
        super(itemView);
        tvWord = itemView.findViewById(R.id.word_text);
    }

    public void setData(String word) {
        this.word = word;
        tvWord.setText(this.word);
    }
}
