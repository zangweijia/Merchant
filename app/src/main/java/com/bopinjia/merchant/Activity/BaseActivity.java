package com.bopinjia.merchant.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.bopinjia.merchant.app.MerchantApplication;
import com.bopinjia.merchant.volley.FastVolley;

/**
 * Created by ZWJ on 2016/12/13
 */

public abstract class BaseActivity extends Activity {
    private FastVolley mFastVolley;
    private String HASHCODE;

    public BaseActivity() {
        super();
        HASHCODE = Integer.toHexString(this.hashCode()) + "@";// 加上@符号，将拼在一起的两个HashCode分开
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题栏
        setupViewLayout();
        initView();
        listener();
        logicDispose();

    }

    //初始化布局
    public abstract void setupViewLayout();

    //初始化UI
    public abstract void initView();

    //事件监听
    public abstract void listener();

    //逻辑
    public abstract void logicDispose();


    public void addDefaultRequest(Request<?> request) {
        mFastVolley.addDefaultRequest(HASHCODE, request);
    }

    public void addShortRequest(Request<?> request) {
        mFastVolley.addShortRequest(HASHCODE, request);
    }

    public void addRequest(Request<?> request, RetryPolicy retryPolicy) {
        mFastVolley.addRequest(HASHCODE, request, retryPolicy);
    }

    public void cancelAll(Object tag) {
        mFastVolley.cancelAll(HASHCODE, tag);
    }

    public void cancelAll() {
        mFastVolley.cancelAll(HASHCODE);
    }

    public boolean isNetworkActive() {
        return MerchantApplication.getInstance().isNetworkActive();
    }
}
