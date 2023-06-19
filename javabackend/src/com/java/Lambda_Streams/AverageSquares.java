package com.java.Lambda_Streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Stream;

public class AverageSquares {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> si = Stream.of(arr);

        System.out.println(si.filter(i -> i%2!=0)
                .mapToDouble(i -> i*i).average());

    }
}



