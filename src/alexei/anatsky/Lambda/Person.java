package alexei.anatsky.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {
    private String name;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Harper Mc Donal", "Johny Brown Li",
                "Can Jilo Fy");

        List<Person> people = names.stream()
                .map(Person::new)
                .collect(Collectors.toList());

        System.out.println("People names: ");
        people.stream()
                .map(Person::getName)
                .forEach(System.out::println);
    }

}
