package p18xxx.p18108;

// 제목 : 1998년생인 내가 태국에서는 2541년생?!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Integer.parseInt(br.readLine()) - 543);

    }
}
