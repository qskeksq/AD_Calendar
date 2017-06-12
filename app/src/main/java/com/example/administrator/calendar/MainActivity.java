package com.example.administrator.calendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridView, gridView_day;
    List<String> days_of_week, days;
    Day_of_Week_Adapter adapter;
    Day_Adapter day_adapter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1.
        gridView = (GridView) findViewById(R.id.grid_day_of_week);
        gridView_day = (GridView) findViewById(R.id.grid_days);

        // 2.
        days_of_week = new ArrayList<>();
        days_of_week.add("일");
        days_of_week.add("월");
        days_of_week.add("화");
        days_of_week.add("수");
        days_of_week.add("목");
        days_of_week.add("금");
        days_of_week.add("토");

        days = new ArrayList<>();
//        for(int i=0; i<30; i++){
//            days.add(i+1+"");
//        }

        // 3.
        adapter = new Day_of_Week_Adapter(days_of_week);
        day_adapter = new Day_Adapter(days);

        // 4.
        gridView.setAdapter(adapter);
        gridView_day.setAdapter(day_adapter);

        TextView textView2 = (TextView) findViewById(R.id.test3);


        setDate(0, 0);
    }

    public void setDate(int a, int b){
        // 1일 설정
        Calendar curCal = Calendar.getInstance();  // 캘린더 객체 가져오기

        TextView textView2 = (TextView) findViewById(R.id.test2);
        curCal.set(curCal.get(Calendar.YEAR)+a, curCal.get(Calendar.MONTH)+b, 1);  // 년도, 월은 캘린더로, 날짜는 1일로 설정해준다.
        textView2.setText(curCal.get(Calendar.DAY_OF_WEEK)+"");
        // 1일에서 -1 한 만큼 공백을 더해준다.
        for(int i=0; i < curCal.get(Calendar.DAY_OF_WEEK)-1; i++){
            days.add("");
        }
        // 이번달 날 수
        for(int j=0; j < curCal.getActualMaximum(Calendar.DAY_OF_MONTH); j++){
            days.add(""+(j+1));
        }


    }




}
