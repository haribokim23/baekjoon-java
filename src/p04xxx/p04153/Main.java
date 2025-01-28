package p04xxx.p04153;

// 제목 : 직각삼각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<Integer>();
        StringTokenizer st;
        int one, two, three;

        while (true) {
            st = new StringTokenizer(br.readLine());
            one = Integer.parseInt(st.nextToken());

            if (one == 0) {
                break;
            }

            al.clear();
            al.add(one);
            al.add(Integer.parseInt(st.nextToken()));
            al.add(Integer.parseInt(st.nextToken()));
            al.sort(null);

            if (al.get(0) * al.get(0) + al.get(1) * al.get(1) == al.get(2) * al.get(2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

        br.close();

    }
}
