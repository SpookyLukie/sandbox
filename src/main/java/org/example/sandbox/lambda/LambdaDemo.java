package org.example.sandbox.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {

    public static void main(String[] args) {


        // x -> x * 2;


        //Predicate
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function
        Function<Integer, Integer> function = x -> {
            x = x + 5;
            return x * 2;
        };

        //Supplier (least used lambda
        Supplier<String> supplier = () -> "Hello World";

        // Consumer
        Consumer<String> consumer = x -> System.out.println(x);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "b2", "c1", "c2");

        myList.stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(x -> System.out.println(x));
    }
}
