package com.cheng.simplemvp;


import android.util.Log;

import com.cheng.simplemvplibrary.BasePresenter;

public class MainPresenter extends BasePresenter<MainModel, MainView> {
    public void getData() {//这里要注意判空（view和model可能为空）
        String dataFromNet = null;
        if (model != null) {
            dataFromNet = model.getDataFromNet();
        }
        if (getView() != null) {
            getView().setData(dataFromNet);
        }
    }

    @Override
    protected void onViewDestroy() {//销毁Activity时的操作，可以停止当前的model
        Log.i("view-uninstall", "MainActivity finished");
        if (model != null) {
            model.stopRequest();
        }
    }

}
