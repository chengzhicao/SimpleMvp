package com.cheng.simplemvp;


import android.util.Log;

import com.cheng.simplemvplibrary.BasePresenter;
import com.google.gson.Gson;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class MainPresenter extends BasePresenter<MainModel, MainView> {

    public void getData() {//这里要注意判空（view和model可能为空）
        if (model != null) {
            Observable<List<User>> observable = model.getDataFromNet();
            observable.observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<User>>() {
                @Override
                public void onSubscribe(Disposable d) {
                }

                @Override
                public void onNext(List<User> users) {
                    if (getView() != null) {
                        getView().setData(new Gson().toJson(users));
                    }
                }

                @Override
                public void onError(Throwable e) {
                }

                @Override
                public void onComplete() {
                }
            });
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
