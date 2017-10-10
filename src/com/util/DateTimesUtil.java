package com.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: JiaoGuojun
 * @Description:对时间的处理,获取/转换/校验
 * @Date: Created in 17:28 2017/9/28
 */
public class DateTimesUtil {
    public static String formatDay8Str = "yyyyMMdd";
    public static String formatDay10Str = "yyyy-MM-dd";
    public static String formatDay11Str = "yyyy年MM月dd日";
    public static String formatDayTime12Str = "yyMMddHHmmss";
    public static String formatDayTime14Str = "yyyyMMdd HHmmss";
    public static String formatDay14Str = "yyyyMMddHHmmss";
    public static String formatDayTime15Str = "yyyy-MM-dd HH:mm";
    public static String formatDayTime16Str = "yyyyMMdd HH:mm:ss";
    public static String formatDayTime18Str = "yyyy-MM-dd HH:mm:ss";
    public static String formatDayTime22Str = "yyyyMMdd HH:mm:ss.SSSSSS";
    public static String formatDayTime24Str = "yyyy-MM-dd HH:mm:ss.SSSSSS";
    public static String formatTime6Str = "HHmmss";
    public static String formatTime8Str = "HH:mm:ss";
    public static String formatTime10Str = "MMddHHmmss";
    public static String formatTimeHHmmStr = "HHmm";

    public static String date(String fmt){
        return new SimpleDateFormat(fmt).format(new Date());
    }

    public static String day8(){
        return new SimpleDateFormat(formatDay8Str).format(new Date());
    }

    public static String day8(Date date){
        return new SimpleDateFormat(formatDay8Str).format(date);
    }

    public static String day8(Timestamp timestamp){
        return new SimpleDateFormat(formatDay8Str).format(timestamp);
    }

    public static String day10(){
        return new SimpleDateFormat(formatDay10Str).format(new Date());
    }

    public static String day10(Date date){
        return new SimpleDateFormat(formatDay10Str).format(date);
    }

    public static String day10(Timestamp timestamp){
        return new SimpleDateFormat(formatDay10Str).format(timestamp);
    }

    public static String day11(){
        return new SimpleDateFormat(formatDay11Str).format(new Date());
    }

    public static String day11(Date date){
        return new SimpleDateFormat(formatDay11Str).format(date);
    }

    public static String day11(Timestamp timestamp){
        return new SimpleDateFormat(formatDay11Str).format(timestamp);
    }

    public static String dayTime12(){
        return new SimpleDateFormat(formatDayTime12Str).format(new Date());
    }

    public static String dayTime12(Date date){
        return new SimpleDateFormat(formatDayTime12Str).format(date);
    }

    public static String dayTime12(Timestamp timestamp){
        return new SimpleDateFormat(formatDayTime12Str).format(timestamp);
    }

    public static String dayTime14(){
        return new SimpleDateFormat(formatDayTime14Str).format(new Date());
    }

    public static String dayTime14(Date date){
        return new SimpleDateFormat(formatDayTime14Str).format(date);
    }

    public static String dayTime14(Timestamp timestamp){
        return new SimpleDateFormat(formatDayTime14Str).format(timestamp);
    }

    public static String day14(){
        return new SimpleDateFormat(formatDay14Str).format(new Date());
    }

    public static String day14(Date date){
        return new SimpleDateFormat(formatDay14Str).format(date);
    }

    public static String day14(Timestamp timestamp){
        return new SimpleDateFormat(formatDay14Str).format(timestamp);
    }

    public static String dateTime15(){
        return new SimpleDateFormat(formatDayTime15Str).format(new Date());
    }

    public static String dateTime15(Date date){
        return new SimpleDateFormat(formatDayTime15Str).format(date);
    }

    public static String dateTime15(Timestamp timestamp){
        return new SimpleDateFormat(formatDayTime15Str).format(timestamp);
    }

    public static String dayTime16(){
        return new SimpleDateFormat(formatDayTime16Str).format(new Date());
    }

    public static String dayTime16(Date date){
        return new SimpleDateFormat(formatDayTime16Str).format(date);
    }

    public static String dayTime16(Timestamp timestamp){
        return new SimpleDateFormat(formatDayTime16Str).format(timestamp);
    }

    public static String dayTime18(){
        return new SimpleDateFormat(formatDayTime18Str).format(new Date());
    }

    public static String dayTime18(Date date){
        return new SimpleDateFormat(formatDayTime18Str).format(date);
    }

    public static String dayTime18(Timestamp timestamp){
        return new SimpleDateFormat(formatDayTime18Str).format(timestamp);
    }

    public static String dayTime22(){
        return new SimpleDateFormat(formatDayTime22Str).format(new Date());
    }

    public static String dayTime22(Date date){
        return new SimpleDateFormat(formatDayTime22Str).format(date);
    }

    public static String dayTime22(Timestamp timestamp){
        return new SimpleDateFormat(formatDayTime22Str).format(timestamp);
    }

    public static String dayTime24(){
        return new SimpleDateFormat(formatDayTime24Str).format(new Date());
    }

    public static String dayTime24(Date date){
        return new SimpleDateFormat(formatDayTime24Str).format(date);
    }

    public static String dayTime24(Timestamp timestamp){
        return new SimpleDateFormat(formatDayTime24Str).format(timestamp);
    }

    public static String time4(){
        return new SimpleDateFormat(formatTimeHHmmStr).format(new Date());
    }

    public static String time4(Date date){
        return new SimpleDateFormat(formatTimeHHmmStr).format(date);
    }

    public static String time4(Timestamp timestamp){
        return new SimpleDateFormat(formatTimeHHmmStr).format(timestamp);
    }

    public static String time6(){
        return new SimpleDateFormat(formatTime6Str).format(new Date());
    }

    public static String time6(Date date){
        return new SimpleDateFormat(formatTime6Str).format(date);
    }

    public static String time6(Timestamp timestamp){
        return new SimpleDateFormat(formatTime6Str).format(timestamp);
    }

    public static String time8(){
        return new SimpleDateFormat(formatTime8Str).format(new Date());
    }

    public static String time8(Date date){
        return new SimpleDateFormat(formatTime8Str).format(date);
    }

    public static String time8(Timestamp timestamp){
        return new SimpleDateFormat(formatTime8Str).format(timestamp);
    }

    public static String time10(){
        return new SimpleDateFormat(formatTime10Str).format(new Date());
    }

    public static String time10(Date date){
        return new SimpleDateFormat(formatTime10Str).format(date);
    }

    public static String time10(Timestamp timestamp){
        return new SimpleDateFormat(formatTime10Str).format(timestamp);
    }





}
