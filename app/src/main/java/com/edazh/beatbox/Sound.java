package com.edazh.beatbox;

/**
 * Created by 12392 on 2017/7/15 0015.
 * 管理资源文件名
 */

public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String fileName = components[components.length - 1];
        mName = fileName.replace(".wav", "");
    }

    public void setAssetPath(String assetPath) {
        mAssetPath = assetPath;
    }

    public String getName() {
        return mName;
    }
}
