package com.edusystem.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 花菜
 * @date 2021/4/5 21:08
 */
public class DateUtil {
    public static Date getDateWithStr(String str) throws ParseException {

        //2018-09-06 19:07:27
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        try {
            date = dateFormat.parse(str);
            //System.out.println(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
////        String date = "2020-07-23T16:00:00.000Z";
//        str = str.replace("Z", " UTC");
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
//        Date d = format.parse(str);
//        return d;
////        //        先将该字符串转换为Date类型：
////        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
////        //        Date applyDate = sdf.parse(“2021-01-20T10:09:11Z”);
////        Date applyDate = sdf.parse(str);
////        return applyDate;
    }

    public static int getAge(Date birthDay) throws Exception {
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthDay)) { //出生日期晚于当前时间，无法计算
            throw new IllegalArgumentException(
                    "获取出生日期错误！The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);  //当前年份
        int monthNow = cal.get(Calendar.MONTH);  //当前月份
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); //当前日期
        cal.setTime(birthDay);
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        int age = yearNow - yearBirth;   //计算整岁数
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;//当前日期在生日之前，年龄减一
            }else{
                age--;//当前月份在生日之前，年龄减一
            }
        }
        return age;
    }


    public static String getStrWithDate(Date applyDate ) throws ParseException {
        //        将Date类型转换为需要的字符串类型：
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringDate= sdf1.format(applyDate);
        return stringDate;
    }

}
