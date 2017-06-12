package com.example.administrator.calendar;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


public class Day_Adapter extends BaseAdapter {

    List<String> days_week;
    TextView textView;

    public Day_Adapter(List<String> days){
        this.days_week = days;
    }

    @Override
    public int getCount() {
        return days_week.size();
    }

    @Override
    public Object getItem(int position) {
        return days_week.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        TextView textView;
//        if(convertView == null){
//            textView = new TextView(parent.getContext());
//            textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
//            textView.setBackgroundColor(Color.GREEN);
//        } else {
//            textView = (TextView) convertView;
//        }
//        textView.setText(days_week.get(position));
//
//        // 1. 어쨌든 리턴하는 view 가 중요한 것이고   2. else 에서 무엇을 재활용할지 보여줬다.
//        return textView;

        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_day, parent, false);
            textView = (TextView) convertView.findViewById(R.id.day);
        }

        textView.setText(days_week.get(position));

        return convertView;

    }
}
