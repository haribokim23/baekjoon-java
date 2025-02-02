package p03xxx.p03724;

// 제목 : 표

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            BigInteger[] products = new BigInteger[m];
            Arrays.fill(products, BigInteger.ONE);

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < m; j++) {
                    products[j] = products[j].multiply(new BigInteger(st.nextToken()));
                }
            }

            BigInteger max = products[0];
            int index = 1;

            for (int i = 1; i < m; i++) {
                BigInteger product = products[i];

                if (product.compareTo(max) >= 0) {
                    max = product;
                    index = i + 1;
                }
            }

            sb.append(index).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
