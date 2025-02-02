package p16xxx.p16170;

// 제목 : 오늘의 날짜는?

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy\nMM\ndd", Locale.UK);
        System.out.println(df.format(new Date()));

    }
}
