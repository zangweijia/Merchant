package com.bopinjia.merchant.adapter;

import android.content.Context;

import com.bopinjia.merchant.R;
import com.bopinjia.merchant.Utils.ViewHolderUtils;

import java.util.List;

/**
 * Created by Administrator on 2016/12/14 0014.
 */

public class FragmentMainListAdapter extends CommonAdapter {
    List<String> list;
    Context context;
    int layoutId;


    public FragmentMainListAdapter(List<String> list, Context context, int layoutId) {
        super(list, context, layoutId);
        this.list = list;
        this.context = context;
        this.layoutId = layoutId;
    }

    @Override
    public void convert(ViewHolderUtils holder, Object o, int position) {
        holder.setText(R.id.tv_name, list.get(position));
    }
}
