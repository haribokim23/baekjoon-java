package p01xxx.p01629;

// 제목 : 곱셈

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        long a = Long.parseLong(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        a %= c;

        ArrayList<Long> products = new ArrayList<Long>();
        products.add(a);
        long product = 1;

        for (int index = 0; b > 0; index++) {
            long temp = products.get(index);

            if (b % 2 == 1) {
                product = (product * temp) % c;
            }

            b /= 2;
            products.add((temp * temp) % c);
        }

        System.out.println(product);
    }
}
