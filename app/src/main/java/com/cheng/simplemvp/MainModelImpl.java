package com.cheng.simplemvp;

import android.util.Log;

public class MainModelImpl implements MainModel {
    @Override
    public String getDataFromNet() {
        return "MVP 模式，into fragment";
    }

    @Override
    public void stopRequest() {
        Log.i("model-stopped", "MainModelImpl stop request...");
    }
}
