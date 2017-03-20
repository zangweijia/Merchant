package com.bopinjia.merchant.app;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.bopinjia.merchant.Utils.NetWorkObservable;


/**
 * Created by ZWJ on 2016/12/13 0013.
 */
public class MerchantApplication extends Application {
    private static MerchantApplication application;

    public int Height;


    /**
     * 先创建一个请求队列，因为这个队列是全局的，所以在Application中声明这个队列
     */
    public static RequestQueue queues;


    public MerchantApplication(){
        application=this;
    }

    public synchronized static MerchantApplication getInstance(){
        return application;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        queues = Volley.newRequestQueue(getApplicationContext());
    }

    public static RequestQueue getQueues() {
        return queues;
    }

    /*********************
     * 提供网络全局监听
     ************************/
    private NetWorkObservable mNetWorkObservable;

    public boolean isNetworkActive() {
        if (mNetWorkObservable != null) {
            return mNetWorkObservable.isNetworkActive();
        }
        return true;
    }

    public void registerNetWorkObserver(NetWorkObservable.NetWorkObserver observer) {
        if (mNetWorkObservable != null) {
            mNetWorkObservable.registerObserver(observer);
        }
    }

    public void unregisterNetWorkObserver(NetWorkObservable.NetWorkObserver observer) {
        if (mNetWorkObservable != null) {
            mNetWorkObservable.unregisterObserver(observer);
        }
    }
//    /*****************
//     * 提供全局的Volley
//     ***************************/
//
//    private FastVolley mFastVolley;
//
//    public FastVolley getFastVolley() {
//        if (mFastVolley == null) {
//            synchronized (MerchantApplication.class) {
//                if (mFastVolley == null) {
//                    mFastVolley = new FastVolley(this);
//                    mFastVolley.start();
//                }
//            }
//        }
//        return mFastVolley;
//    }
//
//    private void releaseFastVolley() {
//        if (mFastVolley != null) {
//            mFastVolley.stop();
//        }
//    }
}
