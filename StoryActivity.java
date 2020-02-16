package com.mylittleadventurer.mylittleadventurer.ui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.mylittleadventurer.mylittleadventurer.R;
import com.mylittleadventurer.mylittleadventurer.model.Page;
import com.mylittleadventurer.mylittleadventurer.model.Story1;
import com.mylittleadventurer.mylittleadventurer.model.Story2;

public class StoryActivity extends AppCompatActivity {
    private static final String TAG = StoryActivity.class.getSimpleName();

    //    UI
    private ImageView mImageViewStory;
    private TextView mTextViewStory;

    private Button mButtonOption1;
    private Button mButtonOption2;

    //Intent
    private String mChildsName;
    private String mGender;
    private String mStoryChoice;
    private String mSignUpStatus;

    //CHOICES
    private Page mPage;
    private Story1 mStory1 = new Story1();
    private Story2 mStory2 = new Story2();


    //Story Nouns
    private String proNoun;
    private String posNoun;
    private String proNounUpper;
    private String posNounUpper;
    private String refNoun;
    private String refNounUpper;

    private Drawable mDrawable;
    private String mType;
    private ScrollView mScrollView;

    //PopUp FB
    private RelativeLayout mRelativeLayoutFBShare;
    private LayoutInflater mLIGender;
    private PopupWindow mPopupFBShare;
    private LinearLayout mLinearLayoutStory;
    private String mChildsNameExtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
//get childsname, gender & story choice
        Bundle extras = getIntent().getExtras();
        mChildsNameExtras = extras.getString(getString(R.string.intent_childsname));

        mChildsName = mChildsNameExtras;

        if (mChildsNameExtras.endsWith(" ")) {
            mChildsName.trim();
        }

        mStoryChoice = extras.getString(getString(R.string.intent_storychoice));

        mGender = extras.getString(getString(R.string.intent_gender));

        if (mChildsName == null || mChildsName.isEmpty()) {
            mChildsName = "Little One";
        }

        Log.d(TAG, mChildsName);

        mImageViewStory = (ImageView) findViewById(R.id.imgVwStory);
        mTextViewStory = (TextView) findViewById(R.id.txtVwStory);
        mTextViewStory.setMovementMethod(new ScrollingMovementMethod());
        mScrollView = (ScrollView) findViewById(R.id.SCROLLER_ID);

        mScrollView.fullScroll(View.FOCUS_DOWN);



        mScrollView.setScrollbarFadingEnabled(false);
        mScrollView.setVerticalScrollBarEnabled(true);
        mScrollView.setVerticalFadingEdgeEnabled(false);


        mButtonOption1 = (Button) findViewById(R.id.btnOption1);
        mButtonOption2 = (Button) findViewById(R.id.btnOption2);

        /****************************************************************************
         FONT
         ****************************************************************************/
        Typeface titleTypeface = Typeface.createFromAsset(getAssets(),"Quicksand-Bold.otf");
//        Typeface storyTypeface = Typeface.createFromAsset(getAssets(), "CaviarDreams.ttf");
        Typeface storyTypeface = Typeface.createFromAsset(getAssets(), "Quicksand-Bold.otf");
        mTextViewStory.setTypeface(storyTypeface);
        mButtonOption1.setTypeface(titleTypeface);
        mButtonOption2.setTypeface(titleTypeface);

        loadPage(0);
    }

    private void loadPage(int choice) {


        //CHOOSE STORY
        if(mStoryChoice.contentEquals(getString(R.string.title_story1))) {
            mPage = mStory1.getPage(choice);
        }

        if(mStoryChoice.contentEquals(getString(R.string.title_story2))) {
            mPage = mStory2.getPage(choice);
        }




//        Drawable image = getResources().getDrawable(mPage.getImageIdBoy());
        if (mGender.contentEquals(getString(R.string.action_btn_boy))) {
            mImageViewStory.setImageResource(mPage.getImageIdBoy());

            String pageText = String.valueOf(mPage.getText());
            // Add the name if placeholder included. Won't add if no placeholder
            pageText = String.format(pageText, mChildsName);
            mTextViewStory.setText(pageText);

        }

        if (mGender.contentEquals(getString(R.string.action_btn_girl))) {
            mImageViewStory.setImageResource(mPage.getImageIdGirl());

            String pageText2 = String.valueOf(mPage.getText2());
            // Add the name if placeholder included. Won't add if no placeholder
            pageText2 = String.format(pageText2, mChildsName);
            mTextViewStory.setText(pageText2);
        }



        if (mPage.isFinal()) {

            mButtonOption2.setText("Read another Adventure");
            mButtonOption2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

            mButtonOption1.setVisibility(View.GONE);


        }

        else {
            mButtonOption1.setText(mPage.getChoice1().getText());
            mButtonOption2.setText(mPage.getChoice2().getText());

            mButtonOption1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mPage.getChoice1().getNextPage();
                    mScrollView.scrollTo(0,0);
                    loadPage(nextPage);
                }
            });

            mButtonOption2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mPage.getChoice2().getNextPage();
                    mScrollView.scrollTo(0,0);
                    loadPage(nextPage);
                }
            });
        }






    }

}
