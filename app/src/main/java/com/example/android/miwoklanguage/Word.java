package com.example.android.miwoklanguage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;

public class Word extends AppCompatActivity {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResource;
    private int mImageResourceId= NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED= -1;

    public Word(String defaultTranslation,String miwokTranslation,int imageResource,int audioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mImageResourceId = imageResource;
        mAudioResource = audioResource;

    }

    public Word(String defaultTranslation,String miwokTranslation,int audioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mAudioResource = audioResource;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResource() {
        return mImageResourceId;

    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResource() {
        return mAudioResource;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
}
