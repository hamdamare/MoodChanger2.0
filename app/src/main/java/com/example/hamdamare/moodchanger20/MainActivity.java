package com.example.hamdamare.moodchanger20;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hamdamare.moodchanger20.MainActivity;
import com.example.hamdamare.moodchanger20.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Love Button
        Button button_love = findViewById(R.id.button_love);
        button_love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String love = "https://hellopoetry.com/pablo-neruda/";
                Uri webaddress = Uri.parse(love);
                Intent gotolove = new Intent(Intent.ACTION_VIEW,webaddress);
                if(gotolove.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolove);

            }
        });

        //Excited button
        Button button_excited = findViewById(R.id.button_excited);
        button_excited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String excited = "http://kjhk.org/web/music/";
                Uri webaddress2 = Uri.parse(excited);
                Intent gotoexcited = new Intent(Intent.ACTION_VIEW,webaddress2);

                if(gotoexcited.resolveActivity(getPackageManager())!=null)
                    startActivity(gotoexcited);

            }
        });

        //Relaxed Button
        Button button_relaxed = findViewById(R.id.button_relaxed);
        button_relaxed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String relaxed = "https://www.calmsound.com";
                Uri webaddress3 = Uri.parse(relaxed);
                Intent gotorelaxed = new Intent(Intent.ACTION_VIEW,webaddress3);

                if(gotorelaxed.resolveActivity(getPackageManager())!=null)
                    startActivity(gotorelaxed);
            }
        });

        //Annoyed Buttons

        Button button_annoyed = findViewById(R.id.button_annoyed);
        button_annoyed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String annoyed = "https://www.youtube.com/watch?v=ZN5PoW7_kdA";
                Uri webaddress4 = Uri.parse(annoyed);
                Intent gotoannoyed = new Intent(Intent.ACTION_VIEW,webaddress4);
                if(gotoannoyed.resolveActivity(getPackageManager())!=null)
                    startActivity(gotoannoyed);

            }
        });

        //sleepy button

        Button button_sleepy= findViewById(R.id.button_sleepy);
        button_sleepy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sleepy = "https://www.youtube.com/watch?v=DaXwnTk0hUE";
                Uri webaddress5 = Uri.parse(sleepy);
                Intent gotosleepy = new Intent(Intent.ACTION_VIEW,webaddress5);
                if(gotosleepy.resolveActivity(getPackageManager())!=null)
                    startActivity(gotosleepy);
            }
        });


        // Cry button
        Button button_cry = findViewById(R.id.button_cry);
        button_cry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cry = "http://www.scaryforkids.com/sad-stories/";
                Uri webaddress6 = Uri.parse(cry);
                Intent gotocry = new Intent(Intent.ACTION_VIEW,webaddress6);
                if(gotocry.resolveActivity(getPackageManager())!=null)
                    startActivity(gotocry);
            }
        });
        //Mans button
        Button button_mans = findViewById(R.id.button_mans);
        button_mans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mans = "https://www.youtube.com/watch?v=3M_5oYU-IsU";
                Uri webaddress7 = Uri.parse(mans);
                Intent gotomans = new Intent(Intent.ACTION_VIEW,webaddress7);
                if(gotomans.resolveActivity(getPackageManager())!=null)
                    startActivity(gotomans);
            }
        });
        //Prank button
        Button button_prank = findViewById(R.id.button_prank);
        button_prank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String prank = "https://www.youtube.com/watch?v=XsqW6byqotE";
                Uri webaddresss8 = Uri.parse(prank);
                Intent gotoprank = new Intent(Intent.ACTION_VIEW, webaddresss8);
                if(gotoprank.resolveActivity(getPackageManager())!=null)
                    startActivity(gotoprank);
            }
        });

        //Dumb button
        Button button_dumb = findViewById(R.id.button_dumb);
        button_dumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dumb = "https://pulptastic.com/36-dumbest-things-ever-said-online/";
                Uri webaddress9 = Uri.parse(dumb);
                Intent gotodumb = new Intent(Intent.ACTION_VIEW,webaddress9);
                if(gotodumb.resolveActivity(getPackageManager())!=null)
                    startActivity(gotodumb);
            }
        });

        //shocked button
        Button button_shock = findViewById(R.id.button_shocked);
        button_shock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String shocked = "http://www.sliptalk.com/10-shocking-facts/";
                Uri webaddress10 = Uri.parse(shocked);
                Intent gotoshocked = new Intent(Intent.ACTION_VIEW,webaddress10);
                if(gotoshocked.resolveActivity(getPackageManager())!=null)
                    startActivity(gotoshocked);
            }
        });

    }
}

