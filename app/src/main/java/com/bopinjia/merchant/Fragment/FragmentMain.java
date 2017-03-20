package com.bopinjia.merchant.Fragment;

import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.bopinjia.merchant.R;
import com.bopinjia.merchant.adapter.FragmentMainListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/13 0013.
 * 底部导航首页页面
 */

public class FragmentMain extends BaseFragment implements View.OnClickListener {

    private ListView mList;
    View headerView;
    FragmentMainListAdapter adapter;

    @Override
    public int getInflaterId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initFindViewById(View view) {
        mList = (ListView) view.findViewById(R.id.lv_main);
        headerView = View.inflate(mActivity, R.layout.view_home_main, null);//头部布局

        headerView.findViewById(R.id.main_zy).setOnClickListener(this);
        headerView.findViewById(R.id.main_xh).setOnClickListener(this);
        headerView.findViewById(R.id.main_event).setOnClickListener(this);
        headerView.findViewById(R.id.main_category).setOnClickListener(this);


    }

    @Override
    public void initData() {
        List<String> list = new ArrayList<>();
        list.add("000");
        list.add("111");
        list.add("2222");
        list.add("3333");
        list.add("000");
        list.add("111");
        list.add("2222");
        list.add("3333");

        adapter = new FragmentMainListAdapter(list, mActivity, R.layout.item_main_product);
        mList.setAdapter(adapter);

        mList.addHeaderView(headerView);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.main_zy:
                Toast.makeText(mActivity,"zy",Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_xh:
                Toast.makeText(mActivity,"xh",Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_event:
                Toast.makeText(mActivity,"hd",Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_category:
                Toast.makeText(mActivity,"fl",Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
