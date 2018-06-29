package com.cheng.simplemvp.fragment;


import android.util.Log;

import com.cheng.simplemvplibrary.BasePresenter;

public class BlackPresenter extends BasePresenter<BlackModel, BlackView> {
    public void getData() {
        String dataFromNet = null;
        if (model != null) {
            dataFromNet = model.getDataFromHWW();
        }
        if (getView() != null) {
            getView().setTextData(dataFromNet);
        }
    }

    @Override
    protected void onViewDestroy() {
        Log.i("view-uninstall", "SecondActivity finished");
        if (model != null) {
            model.stopRequest();
        }
    }

}
