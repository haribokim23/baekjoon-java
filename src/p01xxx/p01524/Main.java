package p01xxx.p01524;

// 제목 : 세준세비

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] nList = new int[n];
            int[] mList = new int[m];
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                nList[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < m; i++) {
                mList[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nList);
            Arrays.sort(mList);
            int nIndex = 0;
            int mIndex = 0;

            while (nIndex < n && mIndex < m) {
                if (nList[nIndex] < mList[mIndex]) {
                    nIndex++;
                } else {
                    mIndex++;
                }
            }

            sb.append(nIndex == n ? "B" : "S").append("\n");
        }

        br.close();
        System.out.println(sb);
    }
}
