package p14xxx.p14467;

// 제목 : 소가 길을 건너간 이유 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] locations = new int[11];
        int count = 0;

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken()) + 1;

            if (locations[number] == 0) {
                locations[number] = location;
            } else if (locations[number] != location) {
                count++;
                locations[number] = location;
            }
        }

        br.close();
        System.out.println(count);
    }
}
