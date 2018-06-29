package com.cheng.simplemvp.fragment;


import android.util.Log;

public class BlackModelImpl implements BlackModel {
    @Override
    public String getDataFromHWW() {
        return "data from net";
    }

    @Override
    public void stopRequest() {
        Log.i("model-stopped", "BlackModelImpl stop request...");
    }
}
