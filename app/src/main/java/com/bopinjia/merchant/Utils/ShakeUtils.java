package com.bopinjia.merchant.Utils;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.bopinjia.merchant.R;


/**
 * 控件抖动动画
 * Created by admin on 2016/8/5.
 */
public class ShakeUtils {
    public static void shake(View view, Context context){
        Animation animation= AnimationUtils.loadAnimation(context, R.anim.shake);
        view.startAnimation(animation);
    }
}
