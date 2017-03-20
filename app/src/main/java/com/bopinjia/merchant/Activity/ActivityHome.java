package com.bopinjia.merchant.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bopinjia.merchant.Fragment.FragmentGuanLi;
import com.bopinjia.merchant.Fragment.FragmentMain;
import com.bopinjia.merchant.Fragment.FragmentMy;
import com.bopinjia.merchant.Fragment.FragmentWareHouse;
import com.bopinjia.merchant.R;
import com.bopinjia.merchant.Utils.StatusBarUtils;

/**
 * Created by ZWJ on 2016/12/13 0013.
 */

public class ActivityHome extends FragmentActivity implements View.OnClickListener {


    LinearLayout ll_main, ll_find, ll_circle, ll_my;
    ImageView iv_main, iv_find, iv_circle, iv_my;
    TextView tv_main, tv_show, tv_circle, tv_my;

    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题栏
        setContentView(R.layout.activity_home);

        StatusBarUtils.setWindowStatusBarColor(this,R.color.blue);
        fm = getSupportFragmentManager();
        initUi();
        initListener();
    }



    //初始化UI布局
    private void initUi() {

        ll_main = (LinearLayout) findViewById(R.id.ll_main);
        ll_find = (LinearLayout) findViewById(R.id.ll_find);
        ll_circle = (LinearLayout) findViewById(R.id.ll_circle);
        ll_my = (LinearLayout) findViewById(R.id.ll_my);

        iv_main = (ImageView) findViewById(R.id.iv_main);
        iv_find = (ImageView) findViewById(R.id.iv_find);
        iv_circle = (ImageView) findViewById(R.id.iv_circle);
        iv_my = (ImageView) findViewById(R.id.iv_my);

        tv_main = (TextView) findViewById(R.id.tv_main);
        tv_show = (TextView) findViewById(R.id.tv_show);
        tv_circle = (TextView) findViewById(R.id.tv_circle);
        tv_my = (TextView) findViewById(R.id.tv_my);

        Fragment fragment = (FragmentMain) fm
                .findFragmentByTag("FragmentMain");
        fm.beginTransaction()
                .replace(R.id.ll_fragment,
                        fragment == null ? new FragmentMain() : fragment, "FragmentMain").commit();
    }


    //点击事件
    private void initListener() {
        ll_main.setOnClickListener(this);
        ll_find.setOnClickListener(this);
        ll_circle.setOnClickListener(this);
        ll_my.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.ll_main:
                isCheck(1);
                Fragment fragment = (FragmentMain) fm
                        .findFragmentByTag("FragmentMain");
                fm.beginTransaction()
                        .replace(R.id.ll_fragment,
                                fragment == null ? new FragmentMain() : fragment, "FragmentMain").commit();
                break;
            case R.id.ll_find:
                isCheck(2);

                Fragment fragment2 = (FragmentGuanLi) fm
                        .findFragmentByTag("FragmentGuanLi");
                fm.beginTransaction()
                        .replace(R.id.ll_fragment,
                                fragment2 == null ? new FragmentGuanLi() : fragment2, "FragmentGuanLi").commit();

                break;
            case R.id.ll_circle:
                isCheck(3);
                Fragment fragment3 = (FragmentWareHouse) fm
                        .findFragmentByTag("FragmentWareHouse");
                fm.beginTransaction()
                        .replace(R.id.ll_fragment,
                                fragment3 == null ? new FragmentWareHouse() : fragment3, "FragmentWareHouse").commit();
                break;
            case R.id.ll_my:
                isCheck(4);
                Fragment fragment4 = (FragmentMy) fm
                        .findFragmentByTag("FragmentMy");
                fm.beginTransaction()
                        .replace(R.id.ll_fragment,
                                fragment4 == null ? new FragmentMy() : fragment4, "FragmentMy").commit();
                break;
        }
    }
    private void isCheck(int i) {
        if (i==1){
            iv_main.setImageResource(R.drawable.tab_store_press);
            iv_find.setImageResource(R.drawable.ic_xianhuo);
            iv_circle.setImageResource(R.drawable.ic_zhiyou);
            iv_my.setImageResource(R.drawable.ic_mine );

            tv_main.setTextColor(getResources().getColor(R.color.orange_red));
            tv_show.setTextColor(getResources().getColor(R.color.black));
            tv_circle.setTextColor(getResources().getColor(R.color.black));
            tv_my.setTextColor(getResources().getColor(R.color.black));
        }else if(i==2){
            iv_main.setImageResource(R.drawable.tab_store_);
            iv_find.setImageResource(R.drawable.ic_xianhuo_s);
            iv_circle.setImageResource(R.drawable.ic_zhiyou);
            iv_my.setImageResource(R.drawable.ic_mine);

            tv_main.setTextColor(getResources().getColor(R.color.black));
            tv_show.setTextColor(getResources().getColor(R.color.orange_red));
            tv_circle.setTextColor(getResources().getColor(R.color.black));
            tv_my.setTextColor(getResources().getColor(R.color.black));
        }else if(i==3){
            iv_main.setImageResource(R.drawable.tab_store_);
            iv_find.setImageResource(R.drawable.ic_xianhuo );
            iv_circle.setImageResource(R.drawable.ic_zhiyou_s);
            iv_my.setImageResource(R.drawable.ic_mine);

            tv_main.setTextColor(getResources().getColor(R.color.black));
            tv_show.setTextColor(getResources().getColor(R.color.black));
            tv_circle.setTextColor(getResources().getColor(R.color.orange_red));
            tv_my.setTextColor(getResources().getColor(R.color.black));
        }else if(i==4){
            iv_main.setImageResource(R.drawable.tab_store_);
            iv_find.setImageResource(R.drawable.ic_xianhuo);
            iv_circle.setImageResource(R.drawable.ic_zhiyou);
            iv_my.setImageResource(R.drawable.ic_mine_selected);

            tv_main.setTextColor(getResources().getColor(R.color.black));
            tv_show.setTextColor(getResources().getColor(R.color.black));
            tv_circle.setTextColor(getResources().getColor(R.color.black));
            tv_my.setTextColor(getResources().getColor(R.color.orange_red));
        }
    }


//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            new AlertDialog.Builder(this)
//                    .setTitle(getResources().getString(R.string.show_exit_hint))
//                    .setMessage(getResources().getString(R.string.show_exit_message))
//                    .setPositiveButton(getResources().getString(R.string.show_exit_positive), new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialogInterface, int i) {
//                            ActivityHome.this.finish();
//                        }
//                    }).setNegativeButton(getResources().getString(R.string.show_exit_negative), null).create().show();
//
//        }
//        return super.onKeyDown(keyCode, event);
//    }
}