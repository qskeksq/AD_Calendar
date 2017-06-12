package com.example.administrator.calendar;

/**
 * Created by Administrator on 2017-06-12.
 */

public class Test {

    /**
    TextView textView = (TextView) findViewById(R.id.test);
    TextView textView2 = (TextView) findViewById(R.id.test2);
    TextView textView3 = (TextView) findViewById(R.id.test3);

    Date date = new Date();
    SimpleDateFormat curYear = new SimpleDateFormat("yyyy", Locale.KOREA);
    SimpleDateFormat curMonth = new SimpleDateFormat("MM", Locale.KOREA);
    SimpleDateFormat curDay = new SimpleDateFormat("dd", Locale.KOREA);
        textView.setText(curYear.format(date)+"/"+curMonth.format(date)+"/"+curDay.format(date));

    Calendar mCal = Calendar.getInstance();
        mCal.setTime(new Date());
        textView2.setText(mCal.get(Calendar.YEAR)+"/"+mCal.get(Calendar.MONTH)+"/"+mCal.get(Calendar.DAY_OF_MONTH)+"/"
            +mCal.get(Calendar.DAY_OF_WEEK)+"/"+mCal.getActualMaximum(Calendar.MONTH)+"/"+mCal.getActualMaximum(Calendar.DAY_OF_MONTH));

    Calendar mCal2 = Calendar.getInstance();
        mCal.set(Calendar.MONTH, mCal2.get(Calendar.MONTH));
        textView3.setText(mCal.get(Calendar.YEAR)+"/"+mCal.get(Calendar.MONTH)+"/"+mCal.get(Calendar.DAY_OF_MONTH)+"/"+mCal.get(Calendar.DAY_OF_WEEK));
    **/

     /** 결론
     현재 년도  mCal.get(Calendar.YEAR)
     현재 월    mCal.get(Calendar.MONTH) : 0부터 11까지라서 +1로 리턴해줘야 한다.
     현재 날짜  mCal.get(Calendar.DAY_OF_MONTH)
     현재 요일  mCal.get(Calendar.DAY_OF_WEEK)
     이번달 날 수 mCal.getActualMaximum(Calendar.MONTH) : 5월은 31일, 6월은 30일
     한 개의 달이 가질 수 있는 날의 수 mCal.getMaximum(Calendar.MONTH)
     **/

}
