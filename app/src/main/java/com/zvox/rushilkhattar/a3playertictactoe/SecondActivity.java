package com.zvox.rushilkhattar.a3playertictactoe;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rushilkhattar on 02/08/17.
 */

public class SecondActivity extends AppCompatActivity {

    public static final String TAG = "SecondActivity";

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17,
            b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32,
            b33, b34, b35, b36, b37, b38;

    TextView t1, t2, t3, t4;

    static int countx2 = 0;
    static int counto2 = 0;
    static int countv2 = 0;
    static int countz2 = 0;

    int turn;
    int draw = 36;
    int win = 0;

    Vibrator vibrator;

    MediaPlayer mediaPlayer1;
    ImageView imageView1;

    MediaPlayer mediaPlayer5;
    MediaPlayer mediaPlayer6;
    MediaPlayer mediaPlayer7;
    MediaPlayer mediaPlayer8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        new MyTask3().execute();

        imageView1 = (ImageView) findViewById(R.id.imm1);
        imageView1.setBackgroundResource(R.drawable.my_frame);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView1.getBackground();
        animationDrawable.start();

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);
        b17 = (Button) findViewById(R.id.b17);
        b18 = (Button) findViewById(R.id.b18);

        b19 = (Button) findViewById(R.id.b19);
        b20 = (Button) findViewById(R.id.b20);
        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        b23 = (Button) findViewById(R.id.b23);
        b24 = (Button) findViewById(R.id.b24);
        b25 = (Button) findViewById(R.id.b25);
        b26 = (Button) findViewById(R.id.b26);
        b27 = (Button) findViewById(R.id.b27);

        b28 = (Button) findViewById(R.id.b28);
        b29 = (Button) findViewById(R.id.b29);
        b30 = (Button) findViewById(R.id.b30);
        b31 = (Button) findViewById(R.id.b31);
        b32 = (Button) findViewById(R.id.b32);
        b33 = (Button) findViewById(R.id.b33);
        b34 = (Button) findViewById(R.id.b34);
        b35 = (Button) findViewById(R.id.b35);
        b36 = (Button) findViewById(R.id.b36);

        b37 = (Button) findViewById(R.id.b37);
        b38 = (Button) findViewById(R.id.b38);

        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);


        t4.setText(String.valueOf(countz2));

        if (countz2 == 0) {
            t4.setBackgroundResource(R.drawable.p1);
        }
        if (countz2 == 1) {
            t4.setBackgroundResource(R.drawable.p2);
        }
        if (countz2 == 2) {
            t4.setBackgroundResource(R.drawable.p3);
        }
        if (countz2 == 3) {
            t4.setBackgroundResource(R.drawable.p4);
        }
        if (countz2 == 4) {
            t4.setBackgroundResource(R.drawable.p5);
        }
        if (countz2 == 5) {
            t4.setBackgroundResource(R.drawable.p6);
        }
        if (countz2 == 6) {
            t4.setBackgroundResource(R.drawable.p7);
        }


        t3.setText(String.valueOf(countx2));

        if (countx2 == 0) {
            t3.setBackgroundResource(R.drawable.p1);
        }
        if (countx2 == 1) {
            t3.setBackgroundResource(R.drawable.p2);
        }
        if (countx2 == 2) {
            t3.setBackgroundResource(R.drawable.p3);
        }
        if (countx2 == 3) {
            t3.setBackgroundResource(R.drawable.p4);
        }
        if (countx2 == 4) {
            t3.setBackgroundResource(R.drawable.p5);
        }
        if (countx2 == 5) {
            t3.setBackgroundResource(R.drawable.p6);
        }
        if (countx2 == 6) {
            t3.setBackgroundResource(R.drawable.p7);
        }

        //o

        t2.setText(String.valueOf(counto2));

        if (counto2 == 0) {
            t2.setBackgroundResource(R.drawable.p1);
        }
        if (counto2 == 1) {
            t2.setBackgroundResource(R.drawable.p2);
        }
        if (counto2 == 2) {
            t2.setBackgroundResource(R.drawable.p3);
        }
        if (counto2 == 3) {
            t2.setBackgroundResource(R.drawable.p4);
        }
        if (counto2 == 4) {
            t2.setBackgroundResource(R.drawable.p5);
        }
        if (counto2 == 5) {
            t2.setBackgroundResource(R.drawable.p6);
        }
        if (counto2 == 6) {
            t2.setBackgroundResource(R.drawable.p7);
        }

        //v

        t1.setText(String.valueOf(countv2));

        if (countv2 == 0) {
            t1.setBackgroundResource(R.drawable.p1);
        }
        if (countv2 == 1) {
            t1.setBackgroundResource(R.drawable.p2);
        }
        if (countv2 == 2) {
            t1.setBackgroundResource(R.drawable.p3);
        }
        if (countv2 == 3) {
            t1.setBackgroundResource(R.drawable.p4);
        }
        if (countv2 == 4) {
            t1.setBackgroundResource(R.drawable.p5);
        }
        if (countv2 == 5) {
            t1.setBackgroundResource(R.drawable.p6);
        }
        if (countv2 == 6) {
            t1.setBackgroundResource(R.drawable.p7);
        }


        turn = 1;


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b1.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;
                        b1.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b1.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b1.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b1.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b1.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b1.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b1.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b1.setBackgroundResource(R.drawable.btn_z);
                    }

                }
                endgame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b2.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b2.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b2.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b2.setText("O");
                        vibrator.vibrate(50);

                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b2.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b2.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b2.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b2.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b2.setBackgroundResource(R.drawable.btn_z);
                    }

                }
                endgame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b3.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b3.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b3.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b3.setText("O");
                        vibrator.vibrate(50);

                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b3.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b3.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b3.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b3.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b3.setBackgroundResource(R.drawable.btn_z);
                    }

                }
                endgame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b4.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b4.setText("X");



                        b4.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b4.setText("O");
                        vibrator.vibrate(50);

                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b4.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b4.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b4.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b4.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b4.setBackgroundResource(R.drawable.btn_z);
                    }

                }
                endgame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b5.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b5.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b5.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b5.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b5.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b5.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b5.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b5.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b5.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b6.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b6.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b6.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b6.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b6.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b6.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b6.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b6.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b6.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b7.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b7.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b7.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b7.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b7.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b7.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b7.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b7.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b7.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b8.getText().toString() == "") {
                    draw--;

                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b8.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b8.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b8.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b8.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b8.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b8.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b8.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b8.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b9.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b9.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b9.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b9.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b9.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b9.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b9.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b9.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b9.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b10.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b10.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b10.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b10.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b10.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b10.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b10.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b10.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b10.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b11.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b11.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b11.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b11.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b11.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b11.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b11.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b11.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b11.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b12.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b12.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b12.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b12.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b12.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b12.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b12.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b12.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b12.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b13.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b13.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b13.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b13.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b13.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b13.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b13.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b13.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b13.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (b14.getText().toString() == "") {
                    draw--;

                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b14.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b14.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b14.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b14.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b14.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b14.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b14.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b14.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b15.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b15.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b15.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b15.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b15.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b15.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b15.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b15.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b15.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b16.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b16.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b16.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b16.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b16.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b16.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b16.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b16.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b16.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b17.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b17.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b17.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b17.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b17.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b17.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b17.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b17.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b17.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b18.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b18.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b18.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b18.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b18.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b18.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b18.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b18.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b18.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b19.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b19.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b19.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b19.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b19.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b19.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b19.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b19.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b19.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b20.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b20.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b20.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b20.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b20.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b20.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b20.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b20.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b20.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b21.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b21.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b21.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b21.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b21.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b21.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b21.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b21.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b21.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b22.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b22.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b22.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b22.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b22.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b22.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b22.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b22.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b22.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b23.getText().toString() == "") {

                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b23.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b23.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b23.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b23.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b23.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b23.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b23.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b23.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b24.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b24.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b24.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b24.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b24.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b24.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b24.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b24.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b24.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });


        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b25.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b25.setText("X");

                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b25.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b25.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b25.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b25.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b25.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b25.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b25.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b26.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b26.setText("X");

                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b26.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b26.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b26.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b26.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b26.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b26.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b26.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b27.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b27.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b27.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b27.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b27.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b27.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b27.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b27.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b27.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b28.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b28.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b28.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b28.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b28.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b28.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b28.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b28.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b28.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b29.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b29.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b29.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b29.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b29.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b29.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b29.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b29.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b29.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b30.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b30.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b30.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b30.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b30.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b30.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b30.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b30.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b30.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b31.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b31.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b31.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b31.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b31.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b31.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b31.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b31.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b31.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b32.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b32.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b32.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b32.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b32.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b32.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b32.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b32.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b32.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b33.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b33.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b33.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b33.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b33.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b33.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b33.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b33.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b33.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b34.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b34.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b34.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b34.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b34.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b34.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b34.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b34.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b34.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b35.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b35.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b35.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b35.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b35.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b35.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b35.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b35.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b35.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b36.getText().toString() == "") {
                    draw--;
                    if (turn == 1) {

                        vibrator.vibrate(50);
                        turn = 2;

                        b36.setText("X");
                        mediaPlayer5 = MediaPlayer.create(SecondActivity.this, R.raw.l3);

                        mediaPlayer5.start();

                        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        b36.setBackgroundResource(R.drawable.nikhil2);


                    } else if (turn == 2) {
                        turn = 3;
                        b36.setText("O");
                        vibrator.vibrate(50);
                        mediaPlayer6 = MediaPlayer.create(SecondActivity.this, R.raw.l7);
                        mediaPlayer6.start();
                        mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp1) {
                                mp1.release();
                            }
                        });
                        b36.setBackgroundResource(R.drawable.kashish);
                    } else if (turn == 3) {
                        turn = 4;
                        b36.setText("V");
                        vibrator.vibrate(50);
                        mediaPlayer7 = MediaPlayer.create(SecondActivity.this, R.raw.l9);
                        mediaPlayer7.start();
                        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp2) {
                                mp2.release();
                            }
                        });
                        b36.setBackgroundResource(R.drawable.vikas);
                    } else if (turn == 4) {
                        turn = 1;
                        b36.setText("Z");
                        vibrator.vibrate(50);
                        mediaPlayer8 = MediaPlayer.create(SecondActivity.this, R.raw.l10);
                        mediaPlayer8.start();
                        mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp3) {
                                mp3.release();
                            }
                        });
                        b36.setBackgroundResource(R.drawable.sanya);
                    }

                }
                endgame();
            }
        });

        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer1.stop();


                refreshActivity();


                //x


                if (countx2 == 1) {
                    t3.setBackgroundResource(R.drawable.p2);
                }
                if (countx2 == 2) {
                    t3.setBackgroundResource(R.drawable.p3);
                }
                if (countx2 == 3) {
                    t3.setBackgroundResource(R.drawable.p4);
                }
                if (countx2 == 4) {
                    t3.setBackgroundResource(R.drawable.p5);
                }
                if (countx2 == 5) {
                    t3.setBackgroundResource(R.drawable.p6);
                }
                if (countx2 == 6) {
                    t3.setBackgroundResource(R.drawable.p7);
                }

                //o


                if (counto2 == 1) {
                    t2.setBackgroundResource(R.drawable.p2);
                }
                if (counto2 == 2) {
                    t2.setBackgroundResource(R.drawable.p3);
                }
                if (counto2 == 3) {
                    t2.setBackgroundResource(R.drawable.p4);
                }
                if (counto2 == 4) {
                    t2.setBackgroundResource(R.drawable.p5);
                }
                if (counto2 == 5) {
                    t2.setBackgroundResource(R.drawable.p6);
                }
                if (counto2 == 6) {
                    t2.setBackgroundResource(R.drawable.p7);
                }

                //v


                if (countv2 == 1) {
                    t1.setBackgroundResource(R.drawable.p2);
                }
                if (countv2 == 2) {
                    t1.setBackgroundResource(R.drawable.p3);
                }
                if (countv2 == 3) {
                    t1.setBackgroundResource(R.drawable.p4);
                }
                if (countv2 == 4) {
                    t1.setBackgroundResource(R.drawable.p5);
                }
                if (countv2 == 5) {
                    t1.setBackgroundResource(R.drawable.p6);
                }
                if (countv2 == 6) {
                    t1.setBackgroundResource(R.drawable.p7);
                }

                //z

                if (countz2 == 1) {
                    t4.setBackgroundResource(R.drawable.p2);
                }
                if (countz2 == 2) {
                    t4.setBackgroundResource(R.drawable.p3);
                }
                if (countz2 == 3) {
                    t4.setBackgroundResource(R.drawable.p4);
                }
                if (countz2 == 4) {
                    t4.setBackgroundResource(R.drawable.p5);
                }
                if (countz2 == 5) {
                    t4.setBackgroundResource(R.drawable.p6);
                }
                if (countz2 == 6) {
                    t4.setBackgroundResource(R.drawable.p7);
                }


            }
        });


        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.stop();
                finish();
                Intent intent4 = new Intent(SecondActivity.this, HomePage2.class);
                startActivity(intent4);
            }
        });

    }

    private class MyTask3 extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {

            mediaPlayer1 = MediaPlayer.create(SecondActivity.this, R.raw.four4);
            mediaPlayer1.setLooping(true);
            mediaPlayer1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mediaPlayer.start();
                }
            });


            return null;
        }

    }


    public void endgame() {
        String a1, a2, a3, a4, a5, a6, B1, B2, B3, B4, B5, B6, c1, c2, c3, c4, c5, c6, d1, d2, d3, d4, d5, d6, e1, e2, e3, e4, e5, e6, f1, f2, f3, f4, f5, f6;

        Boolean end = false;

        a1 = b1.getText().toString();
        a2 = b2.getText().toString();
        a3 = b3.getText().toString();
        a4 = b4.getText().toString();
        a5 = b5.getText().toString();
        a6 = b6.getText().toString();


//        t1 = (TextView) findViewById(R.id.t1);
//        t2 = (TextView) findViewById(R.id.t2);
//        t3 = (TextView) findViewById(R.id.t2);

        B1 = b7.getText().toString();
        B2 = b8.getText().toString();
        B3 = b9.getText().toString();
        B4 = b10.getText().toString();
        B5 = b11.getText().toString();
        B6 = b12.getText().toString();

        c1 = b13.getText().toString();
        c2 = b14.getText().toString();
        c3 = b15.getText().toString();
        c4 = b16.getText().toString();
        c5 = b17.getText().toString();
        c6 = b18.getText().toString();

        d1 = b19.getText().toString();
        d2 = b20.getText().toString();
        d3 = b21.getText().toString();
        d4 = b22.getText().toString();
        d5 = b23.getText().toString();
        d6 = b24.getText().toString();

        e1 = b25.getText().toString();
        e2 = b26.getText().toString();
        e3 = b27.getText().toString();
        e4 = b28.getText().toString();
        e5 = b29.getText().toString();
        e6 = b30.getText().toString();


        f1 = b31.getText().toString();
        f2 = b32.getText().toString();
        f3 = b33.getText().toString();
        f4 = b34.getText().toString();
        f5 = b35.getText().toString();
        f6 = b36.getText().toString();


        //1st combination


        if (a1.equals("X") && a2.equals("X") && a3.equals("X")) {

            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();

            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a1.equals("X") && B1.equals("X") && c1.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }

            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a1.equals("X") && B2.equals("X") && c3.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }

            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("X") && B2.equals("X") && B3.equals("X")) {

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);


            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("X") && c2.equals("X") && d3.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }

            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("X") && c1.equals("X") && d1.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("X") && c2.equals("X") && c3.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("X") && d1.equals("X") && e1.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("X") && d2.equals("X") && e3.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("X") && B2.equals("X") && a3.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("X") && d2.equals("X") && d3.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("X") && c2.equals("X") && B3.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("X") && e2.equals("X") && f3.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("X") && e1.equals("X") && f1.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e1.equals("X") && e2.equals("X") && e3.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }

            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e1.equals("X") && d2.equals("X") && c3.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f1.equals("X") && f2.equals("X") && f3.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f1.equals("X") && e2.equals("X") && d3.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }

            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //2nd part


        if (a2.equals("X") && a3.equals("X") && a4.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }

            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a2.equals("X") && B2.equals("X") && c2.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a2.equals("X") && B3.equals("X") && c4.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }

            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("X") && B3.equals("X") && B4.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("X") && c3.equals("X") && d4.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("X") && c2.equals("X") && d2.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("X") && c3.equals("X") && c4.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("X") && d2.equals("X") && e2.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("X") && d3.equals("X") && e4.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("X") && B3.equals("X") && a4.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("X") && d3.equals("X") && d4.equals("X")) {
            win = 1;


            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("X") && c3.equals("X") && B4.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("X") && e3.equals("X") && f4.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("X") && e2.equals("X") && f2.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e2.equals("X") && e3.equals("X") && e4.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e2.equals("X") && d3.equals("X") && c4.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f2.equals("X") && f3.equals("X") && f4.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f2.equals("X") && e3.equals("X") && d4.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //3rd acticity


        if (a3.equals("X") && a4.equals("X") && a5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a3.equals("X") && B3.equals("X") && c3.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a3.equals("X") && B4.equals("X") && c5.equals("X")) {
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("X") && B4.equals("X") && B5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("X") && c3.equals("X") && d3.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("X") && c4.equals("X") && d5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("X") && c4.equals("X") && c5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("X") && d3.equals("X") && e3.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("X") && d4.equals("X") && e5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("X") && B4.equals("X") && a5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("X") && d4.equals("X") && d5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("X") && c4.equals("X") && B5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("X") && e4.equals("X") && f5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("X") && e3.equals("X") && f3.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e3.equals("X") && e4.equals("X") && e5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e3.equals("X") && d4.equals("X") && c5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f3.equals("X") && f4.equals("X") && f5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f3.equals("X") && e4.equals("X") && d5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //4th part


        if (a4.equals("X") && a5.equals("X") && a6.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a4.equals("X") && B4.equals("X") && c4.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a4.equals("X") && B5.equals("X") && c6.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("X") && B5.equals("X") && B6.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("X") && c5.equals("X") && d6.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("X") && c4.equals("X") && d4.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("X") && c5.equals("X") && c6.equals("X")) {
            win = 1;

            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("X") && d4.equals("X") && e4.equals("X")) {

            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("X") && d5.equals("X") && e6.equals("X")) {

            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("X") && B5.equals("X") && a6.equals("X")) {

            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("X") && d5.equals("X") && d6.equals("X")) {

            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("X") && c5.equals("X") && B6.equals("X")) {
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("X") && e5.equals("X") && f6.equals("X")) {

            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("X") && e4.equals("X") && f4.equals("X")) {

            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e4.equals("X") && e5.equals("X") && e6.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e4.equals("X") && d5.equals("X") && c6.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f4.equals("X") && f5.equals("X") && f6.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f4.equals("X") && e5.equals("X") && d6.equals("X")) {
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //5TH part

        if (a5.equals("X") && B5.equals("X") && c5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B5.equals("X") && c5.equals("X") && d5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c5.equals("X") && d5.equals("X") && e5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d5.equals("X") && e5.equals("X") && f5.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //6th part


        if (a6.equals("X") && B6.equals("X") && c6.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B6.equals("X") && c6.equals("X") && d6.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c6.equals("X") && d6.equals("X") && e6.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d6.equals("X") && e6.equals("X") && f6.equals("X")) {
            win = 1;
            countx2++;
            t3.setText(String.valueOf(countx2));
            if (countx2 == 1) {
                t3.setBackgroundResource(R.drawable.p2);
            }
            if (countx2 == 2) {
                t3.setBackgroundResource(R.drawable.p3);
            }
            if (countx2 == 3) {
                t3.setBackgroundResource(R.drawable.p4);
            }
            if (countx2 == 4) {
                t3.setBackgroundResource(R.drawable.p5);
            }
            if (countx2 == 5) {
                t3.setBackgroundResource(R.drawable.p6);
            }
            if (countx2 == 6) {
                t3.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;
        }


        if (a1.equals("O") && a2.equals("O") && a3.equals("O")) {
            win = 1;
            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a1.equals("O") && B1.equals("O") && c1.equals("O")) {
            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a1.equals("O") && B2.equals("O") && c3.equals("O")) {
            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("O") && B2.equals("O") && B3.equals("O")) {
            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("O") && c2.equals("O") && d3.equals("O")) {
            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("O") && c1.equals("O") && d1.equals("O")) {

            win = 1;
            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("O") && c2.equals("O") && c3.equals("O")) {

            win = 1;
            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("O") && d1.equals("O") && e1.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("O") && d2.equals("O") && e3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("O") && B2.equals("O") && a3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("O") && d2.equals("O") && d3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("O") && c2.equals("O") && B3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("O") && e2.equals("O") && f3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("O") && e1.equals("O") && f1.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e1.equals("O") && e2.equals("O") && e3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e1.equals("O") && d2.equals("O") && c3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f1.equals("O") && f2.equals("O") && f3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f1.equals("O") && e2.equals("O") && d3.equals("O")) {
            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a2.equals("O") && a3.equals("O") && a4.equals("O")) {
            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a2.equals("O") && B2.equals("O") && c2.equals("O")) {
            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a2.equals("O") && B3.equals("O") && c4.equals("O")) {
            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("O") && B3.equals("O") && B4.equals("O")) {
            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("O") && c3.equals("O") && d4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("O") && c2.equals("O") && d2.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("O") && c3.equals("O") && c4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("O") && d2.equals("O") && e2.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("O") && d3.equals("O") && e4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("O") && B3.equals("O") && a4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("O") && d3.equals("O") && d4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("O") && c3.equals("O") && B4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("O") && e3.equals("O") && f4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("O") && e2.equals("O") && f2.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e2.equals("O") && e3.equals("O") && e4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e2.equals("O") && d3.equals("O") && c4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f2.equals("O") && f3.equals("O") && f4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f2.equals("O") && e3.equals("O") && d4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //3rd acticity


        if (a3.equals("O") && a4.equals("O") && a5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a3.equals("O") && B3.equals("O") && c3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a3.equals("O") && B4.equals("O") && c5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("O") && B4.equals("O") && B5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("O") && c3.equals("O") && d3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("O") && c4.equals("O") && d5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("O") && c4.equals("O") && c5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("O") && d3.equals("O") && e3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("O") && d4.equals("O") && e5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("O") && B4.equals("O") && a5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("O") && d4.equals("O") && d5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("O") && c4.equals("O") && B5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("O") && e4.equals("O") && f5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("O") && e3.equals("O") && f3.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e3.equals("O") && e4.equals("O") && e5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e3.equals("O") && d4.equals("O") && c5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f3.equals("O") && f4.equals("O") && f5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f3.equals("O") && e4.equals("O") && d5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //4th part


        if (a4.equals("O") && a5.equals("O") && a6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a4.equals("O") && B4.equals("O") && c4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a4.equals("O") && B5.equals("O") && c6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("O") && B5.equals("O") && B6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("O") && c5.equals("O") && d6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("O") && c4.equals("O") && d4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("O") && c5.equals("O") && c6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("O") && d4.equals("O") && e4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("O") && d5.equals("O") && e6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("O") && B5.equals("O") && a6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("O") && d5.equals("O") && d6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("O") && c5.equals("O") && B6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("O") && e5.equals("O") && f6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("O") && e4.equals("O") && f4.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e4.equals("O") && e5.equals("O") && e6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e4.equals("O") && d5.equals("O") && c6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f4.equals("O") && f5.equals("O") && f6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f4.equals("O") && e5.equals("O") && d6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //5TH part

        if (a5.equals("O") && B5.equals("O") && c5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B5.equals("O") && c5.equals("O") && d5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c5.equals("O") && d5.equals("O") && e5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d5.equals("O") && e5.equals("O") && f5.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //6th part


        if (a6.equals("O") && B6.equals("O") && c6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B6.equals("O") && c6.equals("O") && d6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c6.equals("O") && d6.equals("O") && e6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d6.equals("O") && e6.equals("O") && f6.equals("O")) {

            win = 1;

            counto2++;
            t2.setText(String.valueOf(counto2));
            if (counto2 == 1) {
                t2.setBackgroundResource(R.drawable.p2);
            }
            if (counto2 == 2) {
                t2.setBackgroundResource(R.drawable.p3);
            }
            if (counto2 == 3) {
                t2.setBackgroundResource(R.drawable.p4);
            }
            if (counto2 == 4) {
                t2.setBackgroundResource(R.drawable.p5);
            }
            if (counto2 == 5) {
                t2.setBackgroundResource(R.drawable.p6);
            }
            if (counto2 == 6) {
                t2.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;
        }


        if (a1.equals("V") && a2.equals("V") && a3.equals("V")) {

            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a1.equals("V") && B1.equals("V") && c1.equals("V")) {

            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a1.equals("V") && B2.equals("V") && c3.equals("V")) {

            win = 1;


            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("V") && B2.equals("V") && B3.equals("V")) {
            win = 1;


            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("V") && c2.equals("V") && d3.equals("V")) {
            win = 1;


            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("V") && c1.equals("V") && d1.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("V") && c2.equals("V") && c3.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("V") && d1.equals("V") && e1.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("V") && d2.equals("V") && e3.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("V") && B2.equals("V") && a3.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("V") && d2.equals("V") && d3.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("V") && c2.equals("V") && B3.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("V") && e2.equals("V") && f3.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("V") && e1.equals("V") && f1.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e1.equals("V") && e2.equals("V") && e3.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e1.equals("V") && d2.equals("V") && c3.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f1.equals("V") && f2.equals("V") && f3.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f1.equals("V") && e2.equals("V") && d3.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //2nd part


        if (a2.equals("V") && a3.equals("V") && a4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a2.equals("V") && B2.equals("V") && c2.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a2.equals("V") && B3.equals("V") && c4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("V") && B3.equals("V") && B4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("V") && c3.equals("V") && d4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("V") && c2.equals("V") && d2.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("V") && c3.equals("V") && c4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("V") && d2.equals("V") && e2.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("V") && d3.equals("V") && e4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("V") && B3.equals("V") && a4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("V") && d3.equals("V") && d4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("V") && c3.equals("V") && B4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("V") && e3.equals("V") && f4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("V") && e2.equals("V") && f2.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e2.equals("V") && e3.equals("V") && e4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e2.equals("V") && d3.equals("V") && c4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f2.equals("V") && f3.equals("V") && f4.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f2.equals("V") && e3.equals("V") && d4.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //3rd acticity


        if (a3.equals("V") && a4.equals("V") && a5.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a3.equals("V") && B3.equals("V") && c3.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            } mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a3.equals("V") && B4.equals("V") && c5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("V") && B4.equals("V") && B5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("V") && c3.equals("V") && d3.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("V") && c4.equals("V") && d5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {


                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("V") && c4.equals("V") && c5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("V") && d3.equals("V") && e3.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("V") && d4.equals("V") && e5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("V") && B4.equals("V") && a5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            } mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("V") && d4.equals("V") && d5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("V") && c4.equals("V") && B5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            } mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("V") && e4.equals("V") && f5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("V") && e3.equals("V") && f3.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e3.equals("V") && e4.equals("V") && e5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e3.equals("V") && d4.equals("V") && c5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f3.equals("V") && f4.equals("V") && f5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f3.equals("V") && e4.equals("V") && d5.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //4th part


        if (a4.equals("V") && a5.equals("V") && a6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a4.equals("V") && B4.equals("V") && c4.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a4.equals("V") && B5.equals("V") && c6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("V") && B5.equals("V") && B6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("V") && c5.equals("V") && d6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("V") && c4.equals("V") && d4.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("V") && c5.equals("V") && c6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("V") && d4.equals("V") && e4.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            } mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("V") && d5.equals("V") && e6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("V") && B5.equals("V") && a6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            } mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("V") && d5.equals("V") && d6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            } mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("V") && c5.equals("V") && B6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("V") && e5.equals("V") && f6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            } mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("V") && e4.equals("V") && f4.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e4.equals("V") && e5.equals("V") && e6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            } mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e4.equals("V") && d5.equals("V") && c6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f4.equals("V") && f5.equals("V") && f6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            } mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f4.equals("V") && e5.equals("V") && d6.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //5TH part

        if (a5.equals("V") && B5.equals("V") && c5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            } mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B5.equals("V") && c5.equals("V") && d5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c5.equals("V") && d5.equals("V") && e5.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d5.equals("V") && e5.equals("V") && f5.equals("V")) {
            win = 1;

            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }

            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //6th part


        if (a6.equals("V") && B6.equals("V") && c6.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B6.equals("V") && c6.equals("V") && d6.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c6.equals("V") && d6.equals("V") && e6.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d6.equals("V") && e6.equals("V") && f6.equals("V")) {
            win = 1;
            countv2++;
            t1.setText(String.valueOf(countv2));
            if (countv2 == 1) {
                t1.setBackgroundResource(R.drawable.p2);
            }
            if (countv2 == 2) {
                t1.setBackgroundResource(R.drawable.p3);
            }
            if (countv2 == 3) {
                t1.setBackgroundResource(R.drawable.p4);
            }
            if (countv2 == 4) {
                t1.setBackgroundResource(R.drawable.p5);
            }
            if (countv2 == 5) {
                t1.setBackgroundResource(R.drawable.p6);
            }
            if (countv2 == 6) {
                t1.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player V !", Toast.LENGTH_LONG).show();
            end = true;
        }


        if (a1.equals("Z") && a2.equals("Z") && a3.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a1.equals("Z") && B1.equals("Z") && c1.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a1.equals("Z") && B2.equals("Z") && c3.equals("Z")) {
            win = 1;


            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("Z") && B2.equals("Z") && B3.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("Z") && c2.equals("Z") && d3.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B1.equals("Z") && c1.equals("Z") && d1.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("Z") && c2.equals("Z") && c3.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("Z") && d1.equals("Z") && e1.equals("Z")) {

            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("Z") && d2.equals("Z") && e3.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c1.equals("Z") && B2.equals("Z") && a3.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("Z") && d2.equals("Z") && d3.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("Z") && c2.equals("Z") && B3.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("Z") && e2.equals("Z") && f3.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d1.equals("Z") && e1.equals("Z") && f1.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e1.equals("Z") && e2.equals("Z") && e3.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e1.equals("Z") && d2.equals("Z") && c3.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f1.equals("Z") && f2.equals("Z") && f3.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f1.equals("Z") && e2.equals("Z") && d3.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //2nd part


        if (a2.equals("Z") && a3.equals("Z") && a4.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a2.equals("Z") && B2.equals("Z") && c2.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a2.equals("Z") && B3.equals("Z") && c4.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("Z") && B3.equals("Z") && B4.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("Z") && c3.equals("Z") && d4.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B2.equals("Z") && c2.equals("Z") && d2.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("Z") && c3.equals("Z") && c4.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("Z") && d2.equals("Z") && e2.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("Z") && d3.equals("Z") && e4.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c2.equals("Z") && B3.equals("Z") && a4.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("Z") && d3.equals("Z") && d4.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("Z") && c3.equals("Z") && B4.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("Z") && e3.equals("Z") && f4.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d2.equals("Z") && e2.equals("Z") && f2.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e2.equals("Z") && e3.equals("Z") && e4.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e2.equals("Z") && d3.equals("Z") && c4.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f2.equals("Z") && f3.equals("Z") && f4.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f2.equals("Z") && e3.equals("Z") && d4.equals("Z")) {
            win = 1;


            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //3rd acticity


        if (a3.equals("Z") && a4.equals("Z") && a5.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a3.equals("Z") && B3.equals("Z") && c3.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a3.equals("Z") && B4.equals("Z") && c5.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("Z") && B4.equals("Z") && B5.equals("Z")) {

            win = 1;


            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("Z") && c3.equals("Z") && d3.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B3.equals("Z") && c4.equals("Z") && d5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("Z") && c4.equals("Z") && c5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("Z") && d3.equals("Z") && e3.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("Z") && d4.equals("Z") && e5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c3.equals("Z") && B4.equals("Z") && a5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("Z") && d4.equals("Z") && d5.equals("Z")) {
            win = 1;


            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("Z") && c4.equals("Z") && B5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("Z") && e4.equals("Z") && f5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d3.equals("Z") && e3.equals("Z") && f3.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e3.equals("Z") && e4.equals("Z") && e5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e3.equals("Z") && d4.equals("Z") && c5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f3.equals("Z") && f4.equals("Z") && f5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f3.equals("Z") && e4.equals("Z") && d5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //4th part


        if (a4.equals("Z") && a5.equals("Z") && a6.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a4.equals("Z") && B4.equals("Z") && c4.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a4.equals("Z") && B5.equals("Z") && c6.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("Z") && B5.equals("Z") && B6.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("Z") && c5.equals("Z") && d6.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B4.equals("Z") && c4.equals("Z") && d4.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("Z") && c5.equals("Z") && c6.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("Z") && d4.equals("Z") && e4.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("Z") && d5.equals("Z") && e6.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c4.equals("Z") && B5.equals("Z") && a6.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("Z") && d5.equals("Z") && d6.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("Z") && c5.equals("Z") && B6.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("Z") && e5.equals("Z") && f6.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            } mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d4.equals("Z") && e4.equals("Z") && f4.equals("Z")) {
            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e4.equals("Z") && e5.equals("Z") && e6.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (e4.equals("Z") && d5.equals("Z") && c6.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f4.equals("Z") && f5.equals("Z") && f6.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (f4.equals("Z") && e5.equals("Z") && d6.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //5TH part

        if (a5.equals("Z") && B5.equals("Z") && c5.equals("Z")) {
            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B5.equals("Z") && c5.equals("Z") && d5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c5.equals("Z") && d5.equals("Z") && e5.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d5.equals("Z") && e5.equals("Z") && f5.equals("Z")) {

            win = 1;


            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);

            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }


        //6th part


        if (a6.equals("Z") && B6.equals("Z") && c6.equals("Z")) {

            win = 1;

            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B6.equals("Z") && c6.equals("Z") && d6.equals("Z")) {

            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c6.equals("Z") && d6.equals("Z") && e6.equals("Z")) {

            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d6.equals("Z") && e6.equals("Z") && f6.equals("Z")) {

            win = 1;
            countz2++;
            t4.setText(String.valueOf(countz2));
            if (countz2 == 1) {
                t4.setBackgroundResource(R.drawable.p2);
            }
            if (countz2 == 2) {
                t4.setBackgroundResource(R.drawable.p3);
            }
            if (countz2 == 3) {
                t4.setBackgroundResource(R.drawable.p4);
            }
            if (countz2 == 4) {
                t4.setBackgroundResource(R.drawable.p5);
            }
            if (countz2 == 5) {
                t4.setBackgroundResource(R.drawable.p6);
            }
            if (countz2 == 6) {
                t4.setBackgroundResource(R.drawable.p7);
            }
            mediaPlayer1.stop();
            Intent intenti = new Intent(SecondActivity.this, FifthActivity.class);
            startActivity(intenti);
            Toast.makeText(SecondActivity.this, "Winner Player Z !", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (win == 0 && draw == 0) {
            Toast.makeText(SecondActivity.this, "It's a Draw !", Toast.LENGTH_LONG).show();

        }

        if (end) {
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(true);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);
            b26.setEnabled(false);
            b27.setEnabled(false);
            b28.setEnabled(false);
            b29.setEnabled(false);
            b30.setEnabled(false);
            b31.setEnabled(false);
            b32.setEnabled(false);
            b33.setEnabled(false);
            b34.setEnabled(false);
            b35.setEnabled(false);
            b36.setEnabled(false);

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mediaPlayer1.stop();
        finish();
        startActivity(new Intent(getApplicationContext(), HomePage2.class));
    }

    private void refreshActivity() {
        finish();
        startActivity(getIntent());
    }


}
