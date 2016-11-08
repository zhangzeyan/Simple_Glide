package com.simple.glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by zhangzeyan on 16/10/19.
 */
public class NormalUseActivity extends Activity{

    private ImageView testImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_use);

        testImg = (ImageView) findViewById(R.id.testImg);

        Glide.with(this).load("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg").into(testImg);
    }
}
