package p10xxx.p10699;

// 제목 : 오늘 날짜

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
        System.out.println(df.format(new Date()));

    }
}
