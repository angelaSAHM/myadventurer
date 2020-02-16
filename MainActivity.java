package com.mylittleadventurer.mylittleadventurer.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mylittleadventurer.mylittleadventurer.R;
import com.mylittleadventurer.mylittleadventurer.adapter.ImageSwipeAdapter;

import static android.view.View.GONE;
import static android.view.View.INVISIBLE;
import static android.view.View.OnClickListener;
import static android.view.View.OnKeyListener;
import static android.view.View.OnTouchListener;
import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {


    private TextView mTextViewStep1, mTextViewStep2, mTextViewStep3; //TUTORIAL ELEMENTS

    //UI ELEMENTS
    private EditText mEditTextChildsName;
    private TextView mButtonSummary;
    private ImageView mImageViewOk;
    private Button mButtonBoy, mButtonGirl, mButtonGoStory;
    private LinearLayout mLinearLayoutGender;
    private FrameLayout mFrameLayoutStoryChooser;

    //View Adapter
    ViewPager mViewPager;
    ImageSwipeAdapter mAdapter;


    //Conditions
    private String mInstruction, mGender, storyChoice;

    //Pop U Reminder
    private LayoutInflater mLIGenderBelow;
    private PopupWindow mPopupGender;
    private RelativeLayout mRelativeLayoutMain;
    private int currentView;
    private String mChildsName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TUTORIAL ELEMENTS
        mTextViewStep1 = (TextView) findViewById(R.id.txtVwStep1);
        mTextViewStep2 = (TextView) findViewById(R.id.txtVwStep2PopUp);
        mTextViewStep3 = (TextView) findViewById(R.id.txtVwStep3);

        //UI ELEMENTS

        mEditTextChildsName = (EditText) findViewById(R.id.eTxtChildsName);
        mButtonBoy = (Button) findViewById(R.id.btnBoy);
        mButtonGirl = (Button) findViewById(R.id.btnGirl);
        mButtonSummary = (TextView) findViewById(R.id.btnSummary);
        mButtonGoStory = (Button) findViewById(R.id.btnGoStory);
        mImageViewOk = (ImageView) findViewById(R.id.imgVwOK);



        mLinearLayoutGender = (LinearLayout) findViewById(R.id.LLGender);

        Bundle extras = getIntent().getExtras();
        mInstruction = extras.getString(getString(R.string.intent_instruction));




        /*******************************************************************
         WITH TUTORIAL
         *******************************************************************/
        if (mInstruction.contentEquals(getString(R.string.tutorial_yes))) {
            //Gender Buttons Gone
            removeGenderButtons();
            //Story Image Gone
            removeStoryChooser();
            //Summary & Go Button Gone
            removeSummaryGoButtons();

            removeStep2();
            removeStep3();

            /*******************************************************************
             1. User Touch Step 1
             *******************************************************************/
            mTextViewStep1.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    appearChildsName();
                }
            });

            //When User enter child's name
            mEditTextChildsName.setOnKeyListener(new OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {

                    if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {

                        mChildsName = mEditTextChildsName.getText().toString();
                        mTextViewStep2.setVisibility(VISIBLE);
                        mLinearLayoutGender.setVisibility(VISIBLE);
                        mImageViewOk.setVisibility(GONE);
                        removeStep1();
                        return true;
                    }

                    return false;
                }
            });

            mImageViewOk.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    mTextViewStep2.setVisibility(VISIBLE);
                    mLinearLayoutGender.setVisibility(VISIBLE);
                    removeStep1();
                    mImageViewOk.setVisibility(GONE);
                }
            });



            //User chooses a gender
                mButtonBoy.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mButtonBoyPressed();
                        removeStep2();
                        mTextViewStep3.setVisibility(VISIBLE);
                        appearStoryChooser();
                    }
                });

                mButtonGirl.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mButtonGirlpressed();
                        removeStep2();
                        mTextViewStep3.setVisibility(VISIBLE);
                        appearStoryChooser();
                    }
                });

        }



        /*******************************************************************
         WITHOUT TUTORIAL
         *******************************************************************/

        if (mInstruction.contentEquals(getString(R.string.tutorial_no)) ) {
            //Remove Step 1
            removeStep1();
            //Remove Step 2
            removeStep2();
            //Remove Step 3
            removeStep3();
            mImageViewOk.setVisibility(GONE);
            mImageViewOk.setVisibility(GONE);
            mButtonBoy.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    mButtonBoyPressed();

                }
            });

            mButtonGirl.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    mButtonGirlpressed();

                }
            });


        }

        /*******************************************************************
         FONT
         *******************************************************************/
        Typeface genderTypeface = Typeface.createFromAsset(getAssets(),"Quicksand-Bold.otf");
        Typeface stepTypeface = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");

        mEditTextChildsName.setTypeface(genderTypeface);
        mButtonBoy.setTypeface(genderTypeface);
        mButtonGirl.setTypeface(genderTypeface);
        mButtonGoStory.setTypeface(genderTypeface);
        mTextViewStep1.setTypeface(stepTypeface);
        mTextViewStep2.setTypeface(stepTypeface);
        mTextViewStep3.setTypeface(stepTypeface);



        /*******************************************************************
        CHOOSE STORY VIA SWIPE VIEW
         *******************************************************************/

        mViewPager = (ViewPager) findViewById(R.id.pager_image_story);
        mAdapter = new ImageSwipeAdapter(this);
        mViewPager.setAdapter(mAdapter);

        getCurrentStory();

        mButtonSummary.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentStory();
                startSummary(storyChoice);
            }
        });

        //Start a Story
        mButtonGoStory.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                getCurrentStory();
                if (mGender == null || mGender.isEmpty()) {
                    popUpRemider();
                }

                else {
                    //3.2 pass the name of the main character
                    String childsName = mEditTextChildsName.getText().toString();
                    //3.4 pass the gender
                    String gender = mGender;
                    //3.3 pass the story title
                    //3.4 pass sign Up status
                    String intentStoryChoice = storyChoice;
                    startStory(childsName, gender, intentStoryChoice);
                }
            }
        });
    }

    private void mButtonBoyPressed() {
        genderBoyPressed();
        backgroundGender();
    }

    private void mButtonGirlpressed() {
        mGender = getString(R.string.action_btn_girl);
        genderGirlPressed();
        backgroundGender();
    }

    private void appearStoryChooser() {
        mFrameLayoutStoryChooser.setVisibility(VISIBLE);
        mButtonGoStory.setVisibility(VISIBLE);
        mButtonSummary.setVisibility(VISIBLE);
    }


    private void getCurrentStory() {
        currentView = mViewPager.getCurrentItem();
        if (currentView == 0) {
            storyChoice = getText(R.string.title_story1).toString();

        }

        if (currentView == 1) {
            storyChoice = getText(R.string.title_story2).toString();

        }
    }

    private void startSummary(String storyChoice) {
        Intent intentSummary = new Intent(this, SummaryActivity.class);
        intentSummary.putExtra(getString(R.string.intent_storychoice), storyChoice);
        startActivity(intentSummary);
    }

    private void startStory(String childsName, String gender, String intentStoryChoice) {
        Intent intentStory = new Intent(this, StoryActivity.class);
        intentStory.putExtra(getString(R.string.intent_childsname), childsName);
        intentStory.putExtra(getString(R.string.intent_gender), gender);
        intentStory.putExtra(getString(R.string.intent_storychoice), storyChoice);
        startActivity(intentStory);
    }

    private void appearChildsName() {
        mEditTextChildsName.setVisibility(VISIBLE);
    }

    private void genderGirlPressed() {
        mButtonGirl.setBackgroundColor(getResources().getColor(R.color.btn_girl_chosen));
        mButtonBoy.setBackgroundColor(getResources().getColor(R.color.btn_boy_default));
        mButtonBoy.setAlpha((float) .40);
        mButtonGirl.setAlpha(1);
    }

    private void backgroundGender() {
//        mLinearLayoutGender.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void genderBoyPressed() {
        mGender = getString(R.string.action_btn_boy);
        mButtonBoy.setBackgroundColor(getResources().getColor(R.color.btn_boy_chosen));
        mButtonGirl.setBackgroundColor(getResources().getColor(R.color.btn_girl_default));
        mButtonGirl.setAlpha((float) .40);
        mButtonBoy.setAlpha(1);
    }


    private void popUpRemider() {


        mLIGenderBelow = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        ViewGroup gendereminderContainer;
        gendereminderContainer = (ViewGroup) mLIGenderBelow.inflate(R.layout.layout_pop_up, null);

        mPopupGender = new PopupWindow(gendereminderContainer, RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT, true);

        mRelativeLayoutMain = (RelativeLayout) findViewById(R.id.RLMain);
        mPopupGender.showAtLocation(mRelativeLayoutMain, Gravity.BOTTOM, 0,0);


        gendereminderContainer.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mPopupGender.dismiss();
                return true;
            }
        });
    }

    private void removeStep3() {
        mTextViewStep3.setVisibility(GONE);
    }

    private void removeStep2() {
        mTextViewStep2.setVisibility(GONE);
    }

    private void removeStep1() {
        mTextViewStep1.setVisibility(GONE);
    }

    private void removeSummaryGoButtons() {
        mButtonSummary.setVisibility(INVISIBLE);
        mButtonGoStory.setVisibility(INVISIBLE);

    }

    private void removeStoryChooser() {
        mFrameLayoutStoryChooser = (FrameLayout) findViewById(R.id.FLStory);
        mFrameLayoutStoryChooser.setVisibility(GONE);

    }

    private void removeGenderButtons() {
        mLinearLayoutGender = (LinearLayout) findViewById(R.id.LLGender);
        mLinearLayoutGender.setVisibility(GONE);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mInstruction = getString(R.string.tutorial_no);
        removeStep3();

        mButtonBoy.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mButtonBoyPressed();

            }
        });

        mButtonGirl.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mButtonGirlpressed();

            }
        });


    }


}



