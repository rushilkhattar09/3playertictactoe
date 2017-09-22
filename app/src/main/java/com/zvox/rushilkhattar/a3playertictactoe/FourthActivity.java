package com.zvox.rushilkhattar.a3playertictactoe;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by rushilkhattar on 11/08/17.
 */

public class FourthActivity extends AppCompatActivity {

    ImageView imageView10;
    Handler handler = new Handler();

    MediaPlayer mediaPlayer11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        mediaPlayer11 = MediaPlayer.create(FourthActivity.this, R.raw.ty);




            mediaPlayer11.start();
            mediaPlayer11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp4) {
                    mp4.release();
                }
            });








        imageView10 = (ImageView) findViewById(R.id.m11);
        imageView10.setBackgroundResource(R.drawable.lola_3);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView10.getBackground();
        animationDrawable.start();



                handler.postDelayed(new Runnable() {
                    public void run() {
                        mediaPlayer11.stop();
                        Intent intent = new Intent(FourthActivity.this,ThirdActivity.class);
                        startActivity(intent);
                        finish();


                    }
                }, 4500);
            }

    }
