package p04xxx.p04673;

// 제목 : 셀프 넘버

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> selfNumber = new ArrayList<Integer>();
        int num;

        for (int i = 0; i < 10000; i++) {
            selfNumber.add(i + 1);
        }

        for (int i = 0; i < 10000; i++) {
            num = i + 1;

            for (int j = num; j != 0; j /= 10) {
                num += j % 10;
            }

            if (selfNumber.contains((Object) num)) {
                selfNumber.remove((Object) num);
            }
        }

        for (int i = 0; i < selfNumber.size(); i++) {
            System.out.println(selfNumber.get(i));
        }

    }
}
