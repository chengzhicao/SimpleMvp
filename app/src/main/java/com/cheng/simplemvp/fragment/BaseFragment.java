package com.cheng.simplemvp.fragment;


import com.cheng.simplemvplibrary.BaseMvpFragment;
import com.cheng.simplemvplibrary.BasePresenter;
import com.cheng.simplemvplibrary.Model;
import com.cheng.simplemvplibrary.View;

public abstract class BaseFragment<M extends Model, V extends View, P extends BasePresenter> extends BaseMvpFragment<M, V, P> {
}
