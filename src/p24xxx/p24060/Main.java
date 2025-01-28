package p24xxx.p24060;

// 제목 : 알고리즘 수업 - 병합 정렬 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int count;
    private static int[] a;
    private static int[] temp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        count = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();

        a = new int[length];
        temp = new int[length];

        for (int i = 0; i < length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, length - 1);

        if (count > 0) {
            System.out.println(-1);
        }
    }

    private static void mergeSort(int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = (left + right) / 2;
        mergeSort(left, middle);

        if (count == 0) {
            return;
        }

        mergeSort(middle + 1, right);

        if (count == 0) {
            return;
        }

        merge(left, middle, right);
    }

    private static void merge(int left, int middle, int right) {
        int i = left;
        int j = middle + 1;
        int t = 0;

        while (i <= middle && j <= right) {
            int aI = a[i];
            int aJ = a[j];

            if (aI <= aJ) {
                temp[t++] = aI;
                i++;
            } else {
                temp[t++] = aJ;
                j++;
            }
        }

        while (i <= middle) {
            temp[t++] = a[i++];
        }

        while (j <= right) {
            temp[t++] = a[j++];
        }

        i = left;
        t = 0;

        while (i <= right) {
            int tempT = temp[t];

            if (--count == 0) {
                System.out.println(tempT);
                return;
            }

            a[i++] = tempT;
            t++;
        }
    }
}
