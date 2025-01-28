package p03xxx.p03613;

// 제목 : Java vs C++

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        br.close();
        char character = name.charAt(0);

        if (Character.isUpperCase(character) || name.startsWith("_") || name.contains("__")
                || name.endsWith("_")) {
            System.out.println("Error!");
            return;
        }

        int length = name.length();
        boolean uppercase = false;
        boolean underscore = false;

        for (int i = 0; i < length; i++) {
            character = name.charAt(i);

            if (character >= 'A' && character <= 'Z') {
                uppercase = true;
            } else if (character == '_') {
                underscore = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        if (uppercase) {
            if (underscore) {
                sb.append("Error!");
            } else {
                for (int i = 0; i < length; i++) {
                    character = name.charAt(i);

                    if (character >= 'A' && character <= 'Z') {
                        sb.append("_").append(Character.toLowerCase(character));
                    } else {
                        sb.append(character);
                    }
                }
            }
        } else {
            if (underscore) {
                for (int i = 0; i < length; i++) {
                    character = name.charAt(i);

                    if (character == '_') {
                        uppercase = true;
                    } else {
                        sb.append(uppercase ? Character.toUpperCase(character) : character);
                        uppercase = false;
                    }
                }
            } else {
                sb.append(name);
            }
        }

        System.out.println(sb);
    }
}
