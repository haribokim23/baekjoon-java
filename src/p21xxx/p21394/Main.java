package p21xxx.p21394;

// 제목 : 숫자 카드

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> al = new ArrayList<>();

            for (int x = 1; x <= 9; x++) {
                int value = x == 6 ? 9 : x;

                for (int count = Integer.parseInt(st.nextToken()); count > 0; count--) {
                    al.add(value);
                }
            }

            al.sort(null);

            for (int i = al.size() - 1; i >= 0; i -= 2) {
                sb.append(al.get(i)).append(" ");
            }

            for (int i = al.size() % 2; i < al.size(); i += 2) {
                sb.append(al.get(i)).append(" ");
            }

            sb.append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
