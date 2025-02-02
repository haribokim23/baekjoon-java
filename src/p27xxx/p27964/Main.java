package p27xxx.p27964;

// 제목 : 콰트로치즈피자

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        HashSet<String> cheese = new HashSet<>();

        while (st.hasMoreTokens()) {
            String topping = st.nextToken();

            if (topping.endsWith("Cheese")) {
                cheese.add(topping);
            }

            if (cheese.size() == 4) {
                System.out.println("yummy");
                return;
            }
        }

        System.out.println("sad");
    }
}
