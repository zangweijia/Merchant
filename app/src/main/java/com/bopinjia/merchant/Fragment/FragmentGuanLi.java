package com.bopinjia.merchant.Fragment;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bopinjia.merchant.R;
import com.bopinjia.merchant.volley.StringJsonObjectRequest;

import org.json.JSONObject;

/**
 * Created by Administrator on 2016/12/13 0013.
 * 底部导航管理页面
 */

public class FragmentGuanLi extends BaseFragment {

    private TextView tv;

    @Override
    public int getInflaterId() {
        return R.layout.fragment_guan_li;
    }

    @Override
    protected void initFindViewById(View view) {
        tv = (TextView) view.findViewById(R.id.tv_gl);


    }

    @Override
    public void initData() {
        RequestQueue mQueue = Volley.newRequestQueue(mActivity);
        String url = "http://newapi.bopinwang.com/api/Purchase/TopCategory";



    }


}
