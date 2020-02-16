package com.mylittleadventurer.mylittleadventurer.model;

/**
 * Created by AngelaPinaroc on 15/06/16.
 */
public class Page {

    private int mImageIdBoy;
    private int mImageIdGirl;


    private String mText;
    private String mText2;

    public String getText2() {
        return mText2;
    }

    public void setText2(String text2) {
        mText2 = text2;
    }

    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page(int imageId, int imageId2, String text, String text2, Choice choice1, Choice choice2) {
        mImageIdBoy = imageId;
        mImageIdGirl = imageId2;
        mText = text;
        mText2 = text2;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page(int imageId, int imageId2, String text, String text2) {
        mImageIdBoy = imageId;
        mImageIdGirl = imageId2;
        mText = text;
        mText2 = text2;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;

    }


    public int getImageIdBoy() {
        return mImageIdBoy;
    }

    public void setImageIdBoy(int imageId) {
        mImageIdBoy = imageId;
    }

    public int getImageIdGirl() {
        return mImageIdGirl;
    }

    public void setImageIdGirl(int imageId2) {
        mImageIdGirl = imageId2;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }
}