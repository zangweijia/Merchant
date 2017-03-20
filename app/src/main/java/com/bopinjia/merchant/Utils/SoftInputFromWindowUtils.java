package com.bopinjia.merchant.Utils;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by Administrator on 2016/10/19.
 */
public class SoftInputFromWindowUtils {
    /**
     * 关闭手机键盘
     * @param context
     */
    public static void openSoftInput(Activity context){
        if(context.getCurrentFocus()!=null)
        {
            ((InputMethodManager) context.getSystemService(context.INPUT_METHOD_SERVICE))
                    .hideSoftInputFromWindow(context.getCurrentFocus()
                                    .getWindowToken(),
                            InputMethodManager.SHOW_IMPLICIT);
        }
    }
    /**
     * 关闭手机键盘
     * @param context
     */
    public static void closeSoftInput(Activity context){
        if(context.getCurrentFocus()!=null)
        {
            ((InputMethodManager) context.getSystemService(context.INPUT_METHOD_SERVICE))
                    .hideSoftInputFromWindow(context.getCurrentFocus()
                                    .getWindowToken(),
                            InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
}
