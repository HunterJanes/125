package com.example.hjanes.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG =
            SynthesizerActivity.class.getName();
    private final int WHOLE_NOTE = 1000;

    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpfS;
    private MediaPlayer mpG;
    private MediaPlayer mpgS;
    private MediaPlayer mpA;
    private MediaPlayer mpbB;
    private MediaPlayer mpB;
    private MediaPlayer mpC;
    private MediaPlayer mpcS;
    private MediaPlayer mpD;
    private MediaPlayer mpdS;
    private MediaPlayer mphE;
    private MediaPlayer mphF;
    private MediaPlayer mphFS;
    private MediaPlayer mphG;
    private int delay;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpfS = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpgS = MediaPlayer.create(this, R.raw.scalegs);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpbB = MediaPlayer.create(this, R.raw.scalebb);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpcS = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpdS = MediaPlayer.create(this, R.raw.scaleds);
        mphE = MediaPlayer.create(this, R.raw.scalehighe);
        mphF = MediaPlayer.create(this, R.raw.scalehighf);
        mphFS = MediaPlayer.create(this, R.raw.scalehighfs);
        mphG = MediaPlayer.create(this, R.raw.scalehighg);
    }


    private void delayPlaying(int delay) throws InterruptedException {

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    public void onButtonC1Click(View v) {
        try
        {
            mpE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpfS.start();
            delayPlaying(WHOLE_NOTE/2);
            mpG.start();
            delayPlaying(WHOLE_NOTE/2);
            mpgS.start();
            delayPlaying(WHOLE_NOTE/2);
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.start();
            delayPlaying(WHOLE_NOTE/2);
            mpcS.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mphE.start();
            delayPlaying(WHOLE_NOTE/2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onButton1Click(View v) {
        mpE.seekTo(0);
        Log.i(TAG, "Button 1 Clicked");
        mpE.start();
    }
    public void onButton2Click(View v)
    {
        mpF.seekTo(0);
        Log.i(TAG,"Button 2 Clicked");
        mpF.start();
    }
    public void onButton3Click(View v)
    {
        mpfS.seekTo(0);
        Log.i(TAG,"Button 3 Clicked");
        mpfS.start();
    }
    public void onButton4Click(View v)
    {
        mpG.seekTo(0);
        Log.i(TAG,"Button 4 Clicked");
        mpG.start();
    }
    public void onButton5Click(View v) {
        mpgS.seekTo(0);
        Log.i(TAG, "Button 4 Clicked");
        mpgS.start();
    }
    public void onButton6Click(View v)
    {
        mpA.seekTo(0);
        Log.i(TAG,"Button 6 Clicked");
        mpA.start();
    }
    public void onButton7Click(View v)
    {
        mpbB.seekTo(0);
        Log.i(TAG,"Button 7 Clicked");
        mpbB.start();
    }
    public void onButton8Click(View v)
    {
        mpB.seekTo(0);
        Log.i(TAG,"Button 7 Clicked");
        mpB.start();
    }
    public void onButton9Click(View v)
    {
        mpC.seekTo(0);
        Log.i(TAG,"Button 7 Clicked");
        mpC.start();
    }
    public void onButton10Click(View v)
    {
        mpcS.seekTo(0);
        Log.i(TAG,"Button 10 Clicked");
        mpcS.start();
    }
    public void onButton11Click(View v)
    {
        mpD.seekTo(0);
        Log.i(TAG,"Button 11 Clicked");
        mpD.start();
    }
    public void onButton12Click(View v)
    {
        mpdS.seekTo(0);
        Log.i(TAG,"Button 12 Clicked");
        mpdS.start();
    }
    public void onButton13Click(View v)
    {
        mphE.seekTo(0);
        Log.i(TAG,"Button 13 Clicked");
        mphE.start();
    }
    public void onButton14Click(View v)
    {
        mphF.seekTo(0);
        Log.i(TAG,"Button 14 Clicked");
        mphF.start();
    }
    public void onButton15Click(View v)
    {
        mphFS.seekTo(0);
        Log.i(TAG,"Button 15 Clicked");
        mphFS.start();
    }
    public void onButton16Click(View v)
    {
        mphG.seekTo(0);
        Log.i(TAG,"Button 16 Clicked");
        mphG.start();
    }


}
