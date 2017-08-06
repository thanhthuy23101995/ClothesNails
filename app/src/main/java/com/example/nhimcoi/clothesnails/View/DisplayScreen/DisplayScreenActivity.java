package com.example.nhimcoi.clothesnails.View.DisplayScreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nhimcoi.clothesnails.R;
import com.example.nhimcoi.clothesnails.View.HomePage.HomePageActivity;

public class DisplayScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_screen);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    Thread.sleep(1000);
                }catch (Exception ex){
                }finally {
                    Intent iTrangChu = new Intent(DisplayScreenActivity.this, HomePageActivity.class);
                    startActivity(iTrangChu);
                }
            }
        });
        thread.start();
    }
}
