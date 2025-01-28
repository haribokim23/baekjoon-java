package p01xxx.p01296;

// 제목 : 팀 이름 정하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int[] nameCount = new int[4];

        for (int i = 0; i < name.length(); i++) {
            switch (name.charAt(i)) {
                case 'L':
                    nameCount[0]++;
                    break;
                case 'O':
                    nameCount[1]++;
                    break;
                case 'V':
                    nameCount[2]++;
                    break;
                case 'E':
                    nameCount[3]++;
                    break;
            }
        }

        int n = Integer.parseInt(br.readLine());
        String[] teams = new String[n];

        for (int i = 0; i < n; i++) {
            teams[i] = br.readLine();
        }

        Arrays.sort(teams);
        int maxProbability = 0;
        int maxTeamIndex = 0;

        for (int i = 0; i < n; i++) {
            String team = teams[i];
            int[] teamCount = new int[4];
            System.arraycopy(nameCount, 0, teamCount, 0, 4);

            for (int j = 0; j < team.length(); j++) {
                switch (team.charAt(j)) {
                    case 'L':
                        teamCount[0]++;
                        break;
                    case 'O':
                        teamCount[1]++;
                        break;
                    case 'V':
                        teamCount[2]++;
                        break;
                    case 'E':
                        teamCount[3]++;
                        break;
                }
            }

            int probability = 1;

            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    probability *= teamCount[j] + teamCount[k];
                }
            }

            probability %= 100;

            if (probability > maxProbability) {
                maxProbability = probability;
                maxTeamIndex = i;
            }
        }

        br.close();
        System.out.println(teams[maxTeamIndex]);
    }
}
