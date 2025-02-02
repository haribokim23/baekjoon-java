package p01xxx.p01340;

// 제목 : 연도 진행바

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        String month = st.nextToken();
        int day = Integer.parseInt(st.nextToken().split(",")[0]);
        int year = Integer.parseInt(st.nextToken());
        String[] time = st.nextToken().split(":");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int totalDays = 365;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            days[1]++;
            totalDays++;
        }

        double sum = 0;

        switch (month) {
            case "December":
                sum += days[10];
            case "November":
                sum += days[9];
            case "October":
                sum += days[8];
            case "September":
                sum += days[7];
            case "August":
                sum += days[6];
            case "July":
                sum += days[5];
            case "June":
                sum += days[4];
            case "May":
                sum += days[3];
            case "April":
                sum += days[2];
            case "March":
                sum += days[1];
            case "February":
                sum += days[0];
        }

        sum += day - 1;
        sum += (double) hour / 24;
        sum += (double) minute / 1440;
        System.out.println(sum / totalDays * 100);
    }
}
