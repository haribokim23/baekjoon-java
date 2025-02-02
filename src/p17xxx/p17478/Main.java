package p17xxx.p17478;

// 제목 : 재귀함수가 뭔가요?

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static final String intro = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
    private static final String question = "\"재귀함수가 뭔가요?\"";
    private static final String story1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    private static final String story2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    private static final String story3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    private static final String answer = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    private static final String outro = "라고 답변하였지.";
    private static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();

        recurse(0);
    }

    private static void indent(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("____");
        }
    }

    private static void recurse(int count) {
        if (count == 0) {
            System.out.println(intro);
        }

        indent(count);
        System.out.println(question);

        if (count < n) {
            indent(count);
            System.out.println(story1);

            indent(count);
            System.out.println(story2);

            indent(count);
            System.out.println(story3);

            recurse(count + 1);
        } else {
            indent(count);
            System.out.println(answer);
        }

        indent(count);
        System.out.println(outro);
    }
}
