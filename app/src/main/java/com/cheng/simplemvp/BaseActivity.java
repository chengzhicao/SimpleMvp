package com.cheng.simplemvp;


import com.cheng.simplemvplibrary.BaseMvpActivity;
import com.cheng.simplemvplibrary.BasePresenter;
import com.cheng.simplemvplibrary.Model;
import com.cheng.simplemvplibrary.View;

public abstract class BaseActivity<M extends Model, V extends View, P extends BasePresenter> extends BaseMvpActivity<M, V, P> {

}
