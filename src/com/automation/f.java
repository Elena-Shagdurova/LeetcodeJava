package com.automation;

public class f {
    static String solution(String text) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (c == 'f' || c == 'F') {
                result.append('K').append(c);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String text = "force";
        String text2 = "fluffy";

        String output1 = solution(text);
        String output2 = solution(text2);

        System.out.println(output1);
        System.out.println(output2);
    }
}

