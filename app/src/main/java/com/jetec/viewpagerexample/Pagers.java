package com.jetec.viewpagerexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Pagers extends RelativeLayout {
    public Pagers(Context context, int pageNumber) {
        super(context);

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_pagers, null);
        TextView textView = view.findViewById(R.id.textView);
        textView.setText("第"+pageNumber+"頁");

        addView(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }
}
