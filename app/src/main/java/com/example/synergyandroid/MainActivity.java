package com.example.synergyandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int all_cost = 14000;
    public int start = 1000;
    public int stip = 2500;

    public double percent_per_month(double percent_month){
        double percent = 5;
        percent_month = (percent * 0.01) /12;
        return percent_month;
    }

    public int math() {
        double prom;

        int i = 0;
        prom = start + stip;
        prom = prom + (prom * percent_per_month(0));

        while (prom < all_cost) {
            prom = prom + stip;
            prom = prom + (prom * percent_per_month(0));
            i = i + 1;
        }

        return i;
    }
TextView time1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time1 = findViewById(R.id.time);
        time1.setText("На телескоп можно накопить за" +Integer.toString(math()) + "месяцев");
    }

}
