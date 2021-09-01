package com.example.countdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView txtTime;
    TextView txtTimeElapsed;
    Button btnReset;

    private final long startTime = 50*1000;
    private final long interval = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTime =(TextView) findViewById(R.id.txt_Timer);
        txtTimeElapsed = (TextView)findViewById(R.id.txt_Time_Elapsed);
        btnReset =(Button) findViewById(R.id.btn_Reset);

        CountDownTimer countDownTimer = new CountDownTimer(startTime, interval) {
            @Override
            public void onTick(long milisecondsFinieshed) {
                txtTime.setText("Time " + milisecondsFinieshed);
            }

            @Override
            public void onFinish() {

            }
        };

        countDownTimer.start();
    }
}