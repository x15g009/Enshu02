package jp.ac.chiba_fjb.x15g009.enshu02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    SeekBar mSeekR;
    SeekBar mSeekG;
    SeekBar mSeekB;
    FrameLayout mFrameColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSeekR = (SeekBar) findViewById(R.id.seekBar);
        mSeekG = (SeekBar) findViewById(R.id.seekBar2);
        mSeekB = (SeekBar) findViewById(R.id.seekBar3);
        mFrameColor = (FrameLayout) findViewById(R.id.FrameColor);

        mSeekR.setOnSeekBarChangeListener(this);
        mSeekG.setOnSeekBarChangeListener(this);
        mSeekB.setOnSeekBarChangeListener(this);


    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        mFrameColor.setBackgroundColor(Color.rgb(mSeekR.getProgress(),mSeekG.getProgress(),mSeekB.getProgress()));
    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
