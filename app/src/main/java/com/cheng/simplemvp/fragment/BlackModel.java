package com.cheng.simplemvp.fragment;

import com.cheng.simplemvplibrary.Model;

public interface BlackModel extends Model {
    String getDataFromHWW();

    void stopRequest();
}
