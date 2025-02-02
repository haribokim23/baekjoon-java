package p06xxx.p06996;

// 제목 : 애너그램

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            int[] aChars = new int[26];
            int[] bChars = new int[26];

            for (int i = 0; i < a.length(); i++) {
                aChars[a.charAt(i) - 'a']++;
            }

            for (int i = 0; i < b.length(); i++) {
                bChars[b.charAt(i) - 'a']++;
            }

            boolean isAnagram = true;

            for (int i = 0; i < 26; i++) {
                if (aChars[i] != bChars[i]) {
                    isAnagram = false;
                    break;
                }
            }

            sb.append(a).append(" & ").append(b).append(" are ").append(isAnagram ? "" : "NOT ")
                    .append("anagrams.\n");
        }

        br.close();
        System.out.println(sb);
    }
}
