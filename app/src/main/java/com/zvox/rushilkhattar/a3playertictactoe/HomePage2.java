package com.zvox.rushilkhattar.a3playertictactoe;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by rushilkhattar on 14/08/17.
 */

public class HomePage2 extends AppCompatActivity {

    public static int IS_ACTIVITY_OPENED_FIRST_TIME = 10;


    Button button1, button2, button3, button4;

    MediaPlayer mediaPlayer19;

    private InterstitialAd interstitialAd;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        new MyTask2().execute();

        MobileAds.initialize(this, "ca-app-pub-9771570406820302~3687906064");
        interstitialAd = new InterstitialAd(HomePage2.this);
        interstitialAd.setAdUnitId("ca-app-pub-9771570406820302/7136018875");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                if (IS_ACTIVITY_OPENED_FIRST_TIME % 5 == 0) {
                    displayAd();
                }
                IS_ACTIVITY_OPENED_FIRST_TIME++;
            }

        });


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer19.stop();

                Intent intent6 = new Intent(HomePage2.this, ThirdActivity.class);
                startActivity(intent6);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer19.stop();

                Intent intent5 = new Intent(HomePage2.this, MainActivity.class);
                startActivity(intent5);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer19.stop();

                Intent intent4 = new Intent(HomePage2.this, SecondActivity.class);
                startActivity(intent4);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer19.stop();

                Intent intent16 = new Intent(HomePage2.this, HowtoPlay.class);
                startActivity(intent16);
            }
        });

    }

    private void displayAd() {
        interstitialAd.show();
    }

    private class MyTask2 extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {

            mediaPlayer19 = MediaPlayer.create(HomePage2.this, R.raw.zero0);

            mediaPlayer19.setLooping(true);
            mediaPlayer19.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mediaPlayer.start();
                }
            });

            return null;
        }

    }

    @Override
    public void onBackPressed() {
        mediaPlayer19.stop();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}
