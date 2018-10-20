package com.cheng.simplemvp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends BaseActivity<MainModel, MainView, MainPresenter> implements MainView {
    private TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvData = findViewById(R.id.tv_data);
        Button btnFirst = findViewById(R.id.btn_first);
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
        init();
    }


    @Override
    public MainModel createModel() {
        return new MainModelImpl();
    }

    @Override
    public MainView createView() {
        return this;
    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    private void init() {
        if (presenter != null) {
            presenter.getData();
        }
    }

    @Override
    public void setData(String str) {
        tvData.setText(str);
    }

    @Override
    public void showToast(String info) {

    }

    @Override
    public void showProgress() {

    }
}
