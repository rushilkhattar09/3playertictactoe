package com.zvox.rushilkhattar.a3playertictactoe;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by rushilkhattar on 13/08/17.
 */

public class HowtoPlay extends AppCompatActivity {



    Button b;
    MediaPlayer mediaPlayer20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_howto);

        /* ImageView imageView1 = (ImageView) findViewById(R.id.i2);
        imageView1.setBackgroundResource(R.drawable.lola_1);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView1.getBackground();
        animationDrawable.start();*/

       new MyTask2().execute();



        b = (Button) findViewById(R.id.b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                finish();
               mediaPlayer20.stop();
                finish();
                Intent intent5 = new Intent(HowtoPlay.this, HomePage2.class);
                startActivity(intent5);
            }
        });




    }

    private class MyTask2 extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {

            mediaPlayer20 = MediaPlayer.create(HowtoPlay.this, R.raw.five5);

                mediaPlayer20.setLooping(true);
                mediaPlayer20.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
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
        super.onBackPressed();
        mediaPlayer20.stop();
        finish();
        startActivity(new Intent(getApplicationContext(), HomePage2.class));
    }
    }
