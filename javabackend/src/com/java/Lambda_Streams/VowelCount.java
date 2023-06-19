package com.java.Lambda_Streams;

import java.util.Arrays;

public class VowelCount {
    public static void main(String[] args) {
        String[] strArray = {"hi", "hello", "how are ", "you", "amul"};

        Arrays.stream(strArray)
                .filter(s -> s.matches(".*[aeiouAEIOU].*"))
                .forEach(s -> {
                    long vowelCount = s.chars()
                            .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                            .count();
                    System.out.println(s + " (Number of vowels: " + vowelCount + ")");
            });

    }

}
