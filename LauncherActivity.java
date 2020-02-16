package com.mylittleadventurer.mylittleadventurer.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.mylittleadventurer.mylittleadventurer.R;

public class LauncherActivity extends AppCompatActivity {

    private TextView mTextViewStart, mTextViewHow;
    private String mStringInstruction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        //USer Chooses to Start
        mTextViewStart = (TextView) findViewById(R.id.txtVwSubHeadline);
        mTextViewStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStringInstruction = getString(R.string.tutorial_no);
                startMainActivity(mStringInstruction);
            }
        });


        //User chooses Tutorial
        mTextViewHow = (TextView) findViewById(R.id.txtVwHow);
        mTextViewHow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStringInstruction = getString(R.string.tutorial_yes);
                startMainActivity(mStringInstruction);
            }
        });

        /****************************************************************************
         FONT
         ****************************************************************************/
        Typeface titleTypeface = Typeface.createFromAsset(getAssets(),"Pacifico.ttf");
        mTextViewStart.setTypeface(titleTypeface);

    }



    private void startMainActivity(String stringInstruction) {
        Intent intentMainActivity = new Intent(this, MainActivity.class);
        intentMainActivity.putExtra(getString(R.string.intent_instruction), stringInstruction);
        startActivity(intentMainActivity);
    }

    @Override
    protected void onResume() {
        super.onResume();


    }
}
