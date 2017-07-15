package com.edazh.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by 12392 on 2017/7/15 0015.
 * 视图模型对象
 */

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }
}
