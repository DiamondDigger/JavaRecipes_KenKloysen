package alexei.anatsky.Lambda;

import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodLink {
    public static void main(String[] args) {
        System.out.println(Stream.of(2,3,53,45,8,4,3,987,24)
                .map(x -> x/2)
                .collect(Collectors.toList()));

        //lambda
        System.out.println("lambda: ");
        Stream.of(1,2,3,4,5,6,7,8)
                .forEach(x -> System.out.println("x = " + x));

        System.out.println("-------------------");

        //reference on instance of Class System
        System.out.println("reference on instance of Class System : ");
        Stream.of(1,2,3,4,5,6,7,8)
                .forEach(System.out::println);

        System.out.println("-------------------");

        System.out.println("reference variable");
        Consumer<? super Integer> printer = System.out::println;
        Stream.of(1,2,3,4,5,6,7,8)
                .forEach(printer);

        System.out.println("-------------------");

        System.out.println("reference on static method");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("-------------------");
    }
}
