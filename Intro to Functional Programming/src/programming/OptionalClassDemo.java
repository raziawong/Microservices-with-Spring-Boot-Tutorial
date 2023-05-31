package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClassDemo {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango");
        printOptional(fruits, "b");
        printOptional(fruits, "c");

        // instead of using null, Optional is the recommended approach from Java 8
        Optional<String> empty = Optional.empty();
    }

    private static void printOptional(List<String> listing, String targetStr) {
        Predicate<? super String> predicate = str -> str.startsWith(targetStr);
        Optional<String> optional = listing.stream().filter(predicate).findFirst();

        System.out.println("Optional object: " + optional);
        System.out.println("Optional object is empty: " + optional.isEmpty());
        System.out.println("Optional object is present: " + optional.isPresent());
        System.out.println("Optional object get values: " + optional.get());
    }
}
