package p11xxx.p11652;

// 제목 : 카드

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long, Integer> hm = new HashMap<>();

        for (int n = Integer.parseInt(br.readLine()); n > 0; n--) {
            long card = Long.parseLong(br.readLine());
            hm.putIfAbsent(card, 0);
            hm.put(card, hm.get(card) + 1);
        }

        br.close();
        int maxCount = 0;
        long minCard = (long) Math.pow(2, 62);

        for (long card : hm.keySet()) {
            int count = hm.get(card);

            if (count > maxCount) {
                maxCount = count;
                minCard = card;
                continue;
            }

            if (count == maxCount) {
                minCard = Math.min(minCard, card);
            }
        }

        System.out.println(minCard);
    }
}
