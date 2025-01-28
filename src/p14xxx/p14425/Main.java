package p14xxx.p14425;

// 제목 : 문자열 집합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<Character, HashMap> hm = new HashMap<Character, HashMap>();

        while (n-- > 0) {
            HashMap<Character, HashMap> copy = hm;
            String s = br.readLine() + ".";

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (!copy.containsKey(c)) {
                    copy.put(c, new HashMap());
                }

                copy = copy.get(c);
            }
        }

        int count = 0;

        while (m-- > 0) {
            HashMap copy = hm;
            String s = br.readLine() + ".";

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (copy.containsKey(c)) {
                    if (c == '.' && i == s.length() - 1) {
                        count++;
                        break;
                    }

                    copy = (HashMap) copy.get(c);
                } else {
                    break;
                }
            }
        }

        br.close();
        System.out.println(count);
    }
}
