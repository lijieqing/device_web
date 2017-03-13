package com.kstech.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *   閺冦儲婀￠弮鍫曟？瀹搞儱鍙跨猾锟� */
public class DateUtil {

    /**
     *
     * @return
     */
    public static String getCurrentEndMin(){
        Date date = new Date();
        return dateSimpleFormat(date, defaultDateMinFormat.get());
    }
    /**
     * param 2016-09-30
     */
    public static int[] getYearMonthDay(String date){
        int[] result = new int[3];
        String[] strAry = date.split("-");
        result[0] = Integer.parseInt(strAry[0]);
        result[1] = Integer.parseInt(strAry[1])-1;
        result[2] = Integer.parseInt(strAry[2]);
        return result;
    }

    /** yyyyMMddHHmmss鐎涙顑佹稉锟�*/
    public static final String DEFAULT_DATE_TIME_FORMAT_14 = "yyyyMMddHHmmss";

    /** yyyy-MM-dd HH:mm:ss鐎涙顑佹稉锟�*/
    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /** yyyy-MM-dd HH:mm:ss鐎涙顑佹稉锟�*/
    public static final String DEFAULT_DATE_MIN_FORMAT = "yyyy-MM-dd HH:mm";

    /** yyyy-MM-dd鐎涙顑佹稉锟�*/
    public static final String DEFAULT_FORMAT_DATE = "yyyy-MM-dd";

    /** HH:mm:ss鐎涙顑佹稉锟�*/
    public static final String DEFAULT_FORMAT_TIME = "HH:mm:ss";

    /** yyyyMMddHHmmss閺嶇厧绱�*/
    public static final ThreadLocal<SimpleDateFormat> defaultDateTimeFormat14 = new ThreadLocal<SimpleDateFormat>() {

        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DEFAULT_DATE_TIME_FORMAT_14);
        }

    };
    /** yyyy-MM-dd HH:mm:ss閺嶇厧绱�*/
    public static final ThreadLocal<SimpleDateFormat> defaultDateTimeFormat = new ThreadLocal<SimpleDateFormat>() {

        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DEFAULT_DATE_TIME_FORMAT);
        }

    };

    /** yyyy-MM-dd HH:mm:ss閺嶇厧绱�*/
    public static final ThreadLocal<SimpleDateFormat> defaultDateMinFormat = new ThreadLocal<SimpleDateFormat>() {

        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DEFAULT_DATE_MIN_FORMAT);
        }

    };

    /** yyyy-MM-dd閺嶇厧绱�*/
    public static final ThreadLocal<SimpleDateFormat> defaultDateFormat = new ThreadLocal<SimpleDateFormat>() {

        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DEFAULT_FORMAT_DATE);
        }

    };

    /** HH:mm:ss閺嶇厧绱�*/
    public static final ThreadLocal<SimpleDateFormat> defaultTimeFormat = new ThreadLocal<SimpleDateFormat>() {

        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DEFAULT_FORMAT_TIME);
        }

    };

    /**
     * 鐏忓攱ong閺冨爼妫挎潪顒佸灇yyyy-MM-dd HH:mm:ss鐎涙顑佹稉锟絙r>
     * @param timeInMillis 閺冨爼妫縧ong閸婏拷
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String getDateTimeFromMillis(long timeInMillis) {
        return getDateTimeFormat(new Date(timeInMillis));
    }

    /**
     * 鐏忓攱ong閺冨爼妫挎潪顒佸灇yyyy-MM-dd鐎涙顑佹稉锟絙r>
     * @param timeInMillis
     * @return yyyy-MM-dd
     */
    public static String getDateFromMillis(long timeInMillis) {
        return getDateFormat(new Date(timeInMillis));
    }

    /**
     * 鐏忓摼ate鏉烆剚鍨歽yyyMMddHHmmss鐎涙顑佹稉锟�     * <br>
     * @param date Date鐎电钖�
     * @return  yyyyMMddHHmmss
     */
    public static String getDateTimeFormat14(Date date) {
        return dateSimpleFormat(date, defaultDateTimeFormat14.get());
    }

    /**
     * 鐏忓摼ate鏉烆剚鍨歽yyy-MM-dd HH:mm:ss鐎涙顑佹稉锟�     * <br>
     * @param date Date鐎电钖�
     * @return  yyyy-MM-dd HH:mm:ss
     */
    public static String getDateTimeFormat(Date date) {
        return dateSimpleFormat(date, defaultDateTimeFormat.get());
    }

    /**
     * 鐏忓棗鍕鹃張鍫熸）閻ㄥ埇nt鏉烆剚鍨歽yyy-MM-dd閻ㄥ嫬鐡х粭锔胯
     * @param year 楠烇拷
     * @param month 閺堬拷1-12
     * @param day 閺冿拷
     * 濞夘煉绱伴張鍫ｃ�缁�瘖alendar閻ㄥ嫭婀�敍灞剧槷鐎圭偤妾亸锟�
     * 鐎电绶崗銉┿�閺堫亜浠涢崚銈嗘焽
     */
    public static String getDateFormat(int year, int month, int day) {
        return getDateFormat(getDate(year, month, day));
    }

    /**
     * 鐏忓摼ate鏉烆剚鍨歽yyy-MM-dd鐎涙顑佹稉锟絙r>
     * @param date Date鐎电钖�
     * @return yyyy-MM-dd
     */
    public static String getDateFormat(Date date) {
        return dateSimpleFormat(date, defaultDateFormat.get());
    }

    /**
     * 閼惧嘲绶盚H:mm:ss閻ㄥ嫭妞傞梻锟�     * @param date
     * @return
     */
    public static String getTimeFormat(Date date) {
        return dateSimpleFormat(date, defaultTimeFormat.get());
    }

    /**
     * 閺嶇厧绱￠崠鏍ㄦ）閺堢喐妯夌粈鐑樼壐瀵拷
     * @param sdate 閸樼喎顫愰弮銉︽埂閺嶇厧绱�"yyyy-MM-dd"
     * @param format 閺嶇厧绱￠崠鏍ф倵閺冦儲婀￠弽鐓庣础
     * @return 閺嶇厧绱￠崠鏍ф倵閻ㄥ嫭妫╅張鐔告▔缁�拷
     */
    public static String dateFormat(String sdate, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        java.sql.Date date = java.sql.Date.valueOf(sdate);
        return dateSimpleFormat(date, formatter);
    }

    /**
     * 閺嶇厧绱￠崠鏍ㄦ）閺堢喐妯夌粈鐑樼壐瀵拷
     * @param date Date鐎电钖�
     * @param format 閺嶇厧绱￠崠鏍ф倵閺冦儲婀￠弽鐓庣础
     * @return 閺嶇厧绱￠崠鏍ф倵閻ㄥ嫭妫╅張鐔告▔缁�拷
     */
    public static String dateFormat(Date date, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return dateSimpleFormat(date, formatter);
    }

    /**
     * 鐏忓摼ate鏉烆剚鍨氱�妤冾儊娑擄拷
     * @param date Date
     * @param format SimpleDateFormat
     * <br>
     * 濞夘煉绱�SimpleDateFormat娑撹櫣鈹栭弮璁圭礉闁插洨鏁ゆ妯款吇閻ㄥ墢yyy-MM-dd HH:mm:ss閺嶇厧绱�
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String dateSimpleFormat(Date date, SimpleDateFormat format) {
        if (format == null)
            format = defaultDateTimeFormat.get();
        return (date == null ? "" : format.format(date));
    }

    /**
     * 鐏忥拷yyyy-MM-dd HH:mm:ss" 閺嶇厧绱￠惃鍕摟缁楋缚瑕嗘潪顒佸灇Date
     * @param strDate 閺冨爼妫跨�妤冾儊娑擄拷
     * @return Date
     */
    public static Date getDateByDateTimeFormat(String strDate) {
        return getDateByFormat(strDate, defaultDateTimeFormat.get());
    }

    /**
     * 鐏忥拷yyyy-MM-dd" 閺嶇厧绱￠惃鍕摟缁楋缚瑕嗘潪顒佸灇Date
     * @param strDate
     * @return Date
     */
    public static Date getDateByDateFormat(String strDate) {
        return getDateByFormat(strDate, defaultDateFormat.get());
    }

    /**
     * 鐏忓棙瀵氱�姘壐瀵繒娈戦弮鍫曟？鐎涙顑佹稉鑼舵祮閹存�ate鐎电钖�
     * @param strDate 閺冨爼妫跨�妤冾儊娑擄拷
     * @param format 閺嶇厧绱￠崠鏍х摟缁楋缚瑕�
     * @return Date
     */
    public static Date getDateByFormat(String strDate, String format) {
        return getDateByFormat(strDate, new SimpleDateFormat(format));
    }

    /**
     * 鐏忓摖tring鐎涙顑佹稉鍙夊瘻閻撗傜鐎规碍鐗稿蹇氭祮閹存�ate<br>
     * 濞夘煉绱�SimpleDateFormat娑撹櫣鈹栭弮璁圭礉闁插洨鏁ゆ妯款吇閻ㄥ墢yyy-MM-dd HH:mm:ss閺嶇厧绱�
     * @param strDate 閺冨爼妫跨�妤冾儊娑擄拷
     * @param format SimpleDateFormat鐎电钖�
     * @exception ParseException 閺冦儲婀￠弽鐓庣础鏉烆剚宕查崙娲晩
     */
    private static Date getDateByFormat(String strDate, SimpleDateFormat format) {
        if (format == null)
            format = defaultDateTimeFormat.get();
        try {
            return format.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 鐏忓棗鍕鹃張鍫熸）閻ㄥ埇nt鏉烆剚鍨歞ate
     * @param year 楠烇拷
     * @param month 閺堬拷1-12
     * @param day 閺冿拷
     * 濞夘煉绱伴張鍫ｃ�缁�瘖alendar閻ㄥ嫭婀�敍灞剧槷鐎圭偤妾亸锟�
     */
    public static Date getDate(int year, int month, int day) {
        Calendar mCalendar = Calendar.getInstance();
        mCalendar.set(year, month - 1, day);
        return mCalendar.getTime();
    }

    /**
     * 濮瑰倷琚辨稉顏呮）閺堢喓娴夊顔笺亯閺侊拷
     *
     * @param strat 鐠у嘲顫愰弮銉︽埂閿涘本鐗稿寮漼yy-MM-dd
     * @param end 缂佸牊顒涢弮銉︽埂閿涘本鐗稿寮漼yy-MM-dd
     * @return 娑撱倓閲滈弮銉︽埂閻╃妯婃径鈺傛殶
     */
    public static long getIntervalDays(String strat, String end) {
        return ((java.sql.Date.valueOf(end)).getTime() - (java.sql.Date
                .valueOf(strat)).getTime()) / (3600 * 24 * 1000);
    }

    /**
     * 閼惧嘲绶辫ぐ鎾冲楠炵繝鍞�
     * @return year(int)
     */
    public static int getCurrentYear() {
        Calendar mCalendar = Calendar.getInstance();
        return mCalendar.get(Calendar.YEAR);
    }

    /**
     * 閼惧嘲绶辫ぐ鎾冲閺堝牅鍞�
     * @return month(int) 1-12
     */
    public static int getCurrentMonth() {
        Calendar mCalendar = Calendar.getInstance();
        return mCalendar.get(Calendar.MONTH) + 1;
    }

    /**
     * 閼惧嘲绶辫ぐ鎾存箑閸戠姴褰�
     * @return day(int)
     */
    public static int getDayOfMonth() {
        Calendar mCalendar = Calendar.getInstance();
        return mCalendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 閼惧嘲绶辨禒濠傘亯閻ㄥ嫭妫╅張锟介弽鐓庣础閿涙yyy-MM-dd)
     * @return yyyy-MM-dd
     */
    public static String getToday() {
        Calendar mCalendar = Calendar.getInstance();
        return getDateFormat(mCalendar.getTime());
    }

    /**
     * 閼惧嘲绶遍弰銊ャ亯閻ㄥ嫭妫╅張锟介弽鐓庣础閿涙yyy-MM-dd)
     * @return yyyy-MM-dd
     */
    public static String getYesterday() {
        Calendar mCalendar = Calendar.getInstance();
        mCalendar.add(Calendar.DATE, -1);
        return getDateFormat(mCalendar.getTime());
    }

    /**
     * 閼惧嘲绶遍崜宥呫亯閻ㄥ嫭妫╅張锟介弽鐓庣础閿涙yyy-MM-dd)
     * @return yyyy-MM-dd
     */
    public static String getBeforeYesterday() {
        Calendar mCalendar = Calendar.getInstance();
        mCalendar.add(Calendar.DATE, -2);
        return getDateFormat(mCalendar.getTime());
    }

    /**
     * 閼惧嘲绶遍崙鐘层亯娑斿澧犻幋鏍拷閸戠姴銇夋稊瀣倵閻ㄥ嫭妫╅張锟�     * @param diff 瀹割喖锟介敍姘劀閻ㄥ嫬绶氶崥搴㈠腹閿涘矁绀嬮惃鍕窔閸撳秵甯�
     * @return
     */
    public static String getOtherDay(int diff) {
        Calendar mCalendar = Calendar.getInstance();
        mCalendar.add(Calendar.DATE, diff);
        return getDateFormat(mCalendar.getTime());
    }

    /**
     * 閸欐牕绶辩紒娆忕暰閺冦儲婀￠崝鐘辩瑐娑擄拷鐣炬径鈺傛殶閸氬海娈戦弮銉︽埂鐎电钖�
     *
     * @param date 缂佹瑥鐣鹃惃鍕）閺堢喎顕挒锟�     * @param amount 闂囷拷顩﹀ǎ璇插閻ㄥ嫬銇夐弫甯礉婵″倹鐏夐弰顖氭倻閸撳秶娈戞径鈺傛殶閿涘奔濞囬悽銊ㄧ閺佹澘姘ㄩ崣顖欎簰.
     * @return Date 閸旂姳绗傛稉锟界暰婢垛晜鏆熸禒銉ユ倵閻ㄥ嚍ate鐎电钖�
     */
    public static String getCalcDateFormat(String sDate, int amount) {
        Date date = getCalcDate(getDateByDateFormat(sDate), amount);
        return getDateFormat(date);
    }

    /**
     * 閸欐牕绶辩紒娆忕暰閺冦儲婀￠崝鐘辩瑐娑擄拷鐣炬径鈺傛殶閸氬海娈戦弮銉︽埂鐎电钖�
     *
     * @param date 缂佹瑥鐣鹃惃鍕）閺堢喎顕挒锟�     * @param amount 闂囷拷顩﹀ǎ璇插閻ㄥ嫬銇夐弫甯礉婵″倹鐏夐弰顖氭倻閸撳秶娈戞径鈺傛殶閿涘奔濞囬悽銊ㄧ閺佹澘姘ㄩ崣顖欎簰.
     * @return Date 閸旂姳绗傛稉锟界暰婢垛晜鏆熸禒銉ユ倵閻ㄥ嚍ate鐎电钖�
     */
    public static Date getCalcDate(Date date, int amount) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, amount);
        return cal.getTime();
    }

    /**
     * 閼惧嘲绶辨稉锟介嚋鐠侊紕鐣婚崡浣稿瀻缁夋帊绠ｉ崥搴ｆ畱閺冦儲婀＄�纭呰杽
     * @param date
     * @param hOffset 閺冭泛浜哥粔濠氬櫤閿涘苯褰叉稉楦跨
     * @param mOffset 閸掑棗浜哥粔濠氬櫤閿涘苯褰叉稉楦跨
     * @param sOffset 缁夋帒浜哥粔濠氬櫤閿涘苯褰叉稉楦跨
     * @return
     */
    public static Date getCalcTime(Date date, int hOffset, int mOffset, int sOffset) {
        Calendar cal = Calendar.getInstance();
        if (date != null)
            cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, hOffset);
        cal.add(Calendar.MINUTE, mOffset);
        cal.add(Calendar.SECOND, sOffset);
        return cal.getTime();
    }

    /**
     * 閺嶈宓侀幐鍥х暰閻ㄥ嫬鍕鹃張鍫熸）鐏忓繑妞傞崚鍡欘潡閿涘矁绻戦崶鐐扮娑撶尐ava.Util.Date鐎电钖勯妴锟�     *
     * @param year 楠烇拷
     * @param month 閺堬拷0-11
     * @param date 閺冿拷
     * @param hourOfDay 鐏忓繑妞�0-23
     * @param minute 閸掞拷0-59
     * @param second 缁夛拷0-59
     * @return 娑擄拷閲淒ate鐎电钖�
     */
    public static Date getDate(int year, int month, int date, int hourOfDay,
                               int minute, int second) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, date, hourOfDay, minute, second);
        return cal.getTime();
    }

    /**
     * 閼惧嘲绶遍獮瀛樻箑閺冦儲鏆熼幑锟�     * @param sDate yyyy-MM-dd閺嶇厧绱�
     * @return arr[0]:楠炶揪绱�arr[1]:閺堬拷0-11 , arr[2]閺冿拷
     */
    public static int[] getYearMonthAndDayFrom(String sDate) {
        return getYearMonthAndDayFromDate(getDateByDateFormat(sDate));
    }

    /**
     * 閼惧嘲绶遍獮瀛樻箑閺冦儲鏆熼幑锟�     * @return arr[0]:楠炶揪绱�arr[1]:閺堬拷0-11 , arr[2]閺冿拷
     */
    public static int[] getYearMonthAndDayFromDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int[] arr = new int[3];
        arr[0] = calendar.get(Calendar.YEAR);
        arr[1] = calendar.get(Calendar.MONTH);
        arr[2] = calendar.get(Calendar.DAY_OF_MONTH);
        return arr;
    }
}
