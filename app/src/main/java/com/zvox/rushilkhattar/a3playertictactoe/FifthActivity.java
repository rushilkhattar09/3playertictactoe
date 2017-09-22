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

public class FifthActivity extends AppCompatActivity {


    ImageView imageView11;
    Handler handler = new Handler();
    MediaPlayer mediaPlayer10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


        mediaPlayer10 = MediaPlayer.create(FifthActivity.this, R.raw.ty);
        mediaPlayer10.start();
        mediaPlayer10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp5) {
                mp5.release();
            }
        });


        imageView11 = (ImageView) findViewById(R.id.m11);
        imageView11.setBackgroundResource(R.drawable.lola_3);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView11.getBackground();
        animationDrawable.start();


        handler.postDelayed(new Runnable() {
            public void run() {
                mediaPlayer10.stop();
                Intent intent = new Intent(FifthActivity.this, SecondActivity.class);
                startActivity(intent);
                finish();


            }
        }, 4500);
    }
}
