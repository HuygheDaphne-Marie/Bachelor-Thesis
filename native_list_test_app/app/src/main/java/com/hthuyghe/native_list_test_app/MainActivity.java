package com.hthuyghe.native_list_test_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    WordListAdapter wordListRecyclerAdapter;
    RecyclerView recyclerView;
    String[] wordList = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on",
            "are","as","with","his","they","I","at","be","this","have","from","or","one","had","by",
            "word","but","not","what","all","were","we","when","your","can","said","there","use",
            "an","each","which","she","do","how","their","if","will","up","other","about","out",
            "many","then","them","these","so","some","her","would","make","like","him","into",
            "time","has","look","two","more","write","go","see","number","no","way","could",
            "people","my","than","first","water","been","call","who","oil","its","now","find",
            "long","down","day","did","get","come","made","may","part"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordListRecyclerAdapter = new WordListAdapter();
        wordListRecyclerAdapter.setWords(wordList);

        recyclerView = findViewById(R.id.word_list_recycler);
        recyclerView.setAdapter(wordListRecyclerAdapter);
        recyclerView.setHasFixedSize(true);

    }
}
