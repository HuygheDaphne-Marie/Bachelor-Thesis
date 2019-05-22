package com.hthuyghe.native_timer_test_app;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    final static int REFRESH_RATE_IN_MILIS = 1000 / 60; // Most screens work at 60Hz

    TextView timerText;

    Handler timerHandler = new Handler();
    long startTime = 0L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timerText = findViewById(R.id.timer_text);
        startTimer();
    }

    private void startTimer() {
        if (startTime == 0L) {
            startTime = System.currentTimeMillis();
        }

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                long timeDiff = System.currentTimeMillis() - startTime;
                int totalSeconds = (int) timeDiff / 1000;
                int minutes = totalSeconds / 60;
                int remainingSeconds = totalSeconds % 60;
                int remainingMilis = (int) timeDiff % 1000 / 10;
                timerText.setText(String.format(Locale.ENGLISH,"%02d:%02d:%02d", minutes, remainingSeconds, remainingMilis));

                timerHandler.postDelayed(this, REFRESH_RATE_IN_MILIS);
                // It's pointless to do this any quicker since those values won't be drawn
            }
        };

        timerHandler.post(runnable);
    }
}
