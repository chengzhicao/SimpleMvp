package com.cheng.simplemvp;


import com.cheng.simplemvplibrary.Model;

public interface MainModel extends Model {
    /**
     * 从网络获取数据
     *
     * @return
     */
    String getDataFromNet();

    /**
     * 停止请求
     */
    void stopRequest();
}
