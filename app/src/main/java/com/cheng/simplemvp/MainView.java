package com.cheng.simplemvp;


import com.cheng.simplemvplibrary.View;

public interface MainView extends View {
    /**
     * 设置数据
     *
     * @param str
     */
    void setData(String str);
}
