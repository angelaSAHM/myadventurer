package com.mylittleadventurer.mylittleadventurer.ui;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mylittleadventurer.mylittleadventurer.R;

public class SummaryActivity extends AppCompatActivity {
    private ImageView mImageView;
    private TextView mTextViewTitle, mTextViewSummary;
    private String mStringStoryTitle, mStoryLabel;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        mImageView = (ImageView) findViewById(R.id.imgVwSummary);
        mTextViewTitle = (TextView) findViewById(R.id.txtVwSummaryTitle);
        mTextViewSummary = (TextView) findViewById(R.id.txtVwSummaryP);

        Bundle extras = getIntent().getExtras();
        mStringStoryTitle = extras.getString(getString(R.string.intent_storychoice));

        /*******************************************************************
         FONT
         *******************************************************************/

        Typeface summaryTypeface = Typeface.createFromAsset(getAssets(),"Quicksand-Bold.otf");
        mTextViewSummary.setTypeface(summaryTypeface);
        mTextViewTitle.setTypeface(summaryTypeface);


        if (mStringStoryTitle.contentEquals(getString(R.string.title_story1))) {
            this.setTitle(getString(R.string.title_story1));
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.story1_boy_page2));
            mTextViewTitle.setText(getString(R.string.title_story1));
            mTextViewSummary.setText(getString(R.string.summary_story_1).toString());
        }

        if (mStringStoryTitle.contentEquals(getString(R.string.title_story2))) {
            this.setTitle(getString(R.string.title_story2));
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.story1_girl_page3));
            mTextViewTitle.setText(getString(R.string.title_story2));
            mTextViewSummary.setText(getString(R.string.summary_story_2).toString());
        }



        mRelativeLayout = (RelativeLayout) findViewById(R.id.RLayoutSummary);
        mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

