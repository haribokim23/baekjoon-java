package p13xxx.p13305;

// 제목 : 주유소

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        br.close();
        long totalLength = 0;
        long minPrice = 1_000_000_000;
        long totalPrice = 0;

        while (n-- > 1) {
            long length = Long.parseLong(st1.nextToken());
            long price = Long.parseLong(st2.nextToken());

            if (price < minPrice) {
                totalPrice += totalLength * minPrice;
                totalLength = length;
                minPrice = price;
                continue;
            }

            totalLength += length;
        }

        System.out.println(totalPrice + totalLength * minPrice);
    }
}
