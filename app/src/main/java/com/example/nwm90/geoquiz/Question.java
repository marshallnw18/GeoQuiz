package com.example.nwm90.geoquiz;

/**
 * Created by marshallnw18 on 2/6/2018.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerIsTrue;

    Question(){
    }

    public Question(int mTextResId, boolean mAnswerIsTrue){
        this.mTextResId = mTextResId;
        this.mAnswerIsTrue = mAnswerIsTrue;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public boolean ismAnswerIsTrue() {
        return mAnswerIsTrue;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public void setmAnswerIsTrue(boolean mAnswerIsTrue) {
        this.mAnswerIsTrue = mAnswerIsTrue;
    }
}
