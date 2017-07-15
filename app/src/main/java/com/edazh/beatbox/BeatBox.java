package com.edazh.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 12392 on 2017/7/15 0015.
 */

public class BeatBox {
    private static final String TAG = "BeatBox";
    private static final String SOUNDS_FOLDER = "sample_sounds";
    private AssetManager mAssets;

    private List<Sound> mSounds = new ArrayList<>();

    public BeatBox(Context context) {
        mAssets = context.getAssets();
        loadSounds();
    }

    /**
     * 读取声音资源
     */
    private void loadSounds() {
        String[] soundsNames;
        try {
            soundsNames = mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG, "Found " + soundsNames.length + " sounds");
        } catch (IOException e) {
            Log.e(TAG, "Cloud not list assests", e);
            return;
        }

        for (String fileName : soundsNames) {
            String assetPath = SOUNDS_FOLDER + "/" + fileName;
            Sound sound = new Sound(assetPath);
            mSounds.add(sound);
        }
    }

    public List<Sound> getSounds() {
        return mSounds;
    }
}
