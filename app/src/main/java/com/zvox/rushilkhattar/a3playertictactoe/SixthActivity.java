package com.zvox.rushilkhattar.a3playertictactoe;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by rushilkhattar on 11/08/17.
 */

public class SixthActivity extends AppCompatActivity {

    public static final String TAG = "SixthActivity";

    ImageView imageView12;
    Handler handler = new Handler();
    MediaPlayer mediaPlayer9;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


        mediaPlayer9 = MediaPlayer.create(SixthActivity.this, R.raw.ty);


        mediaPlayer9.start();

        mediaPlayer9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp4) {
                mp4.release();
            }
        });


        imageView12 = (ImageView) findViewById(R.id.m11);
        imageView12.setBackgroundResource(R.drawable.lola_3);


        AnimationDrawable animationDrawable = (AnimationDrawable) imageView12.getBackground();
        animationDrawable.start();


        handler.postDelayed(new Runnable() {
            public void run() {
                mediaPlayer9.stop();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 4500);
    }


}
