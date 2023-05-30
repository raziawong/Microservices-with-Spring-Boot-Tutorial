package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Mircoservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        System.out.print("Print all numbers: ");
        printAllInList(numbers);

        System.out.print("\nPrint only even numbers: ");
        printEvenNumbersInList(numbers);

        System.out.print("\nPrint only odd numbers: ");
        printOddNumbersInList(numbers);

        System.out.print("\nPrint all courses: ");
        printAllInList(courses);
    }

//    private static boolean isEven(int number) {
//        return number % 2 == 0;
//    }

    private static void printAllInList(List<?> listing) {
        // using Method Reference
        listing.stream().forEach(i -> System.out.print(i + " | "));
    }

    private static void printEvenNumbersInList(List<Integer> numbers) {
        numbers.stream()
                // .filter(FP01Functional::isEven) // using Method Reference
                .filter(num -> num%2 == 0) // using Lambda expression
                .forEach(i -> System.out.print(i + " | "));
    }

    private static void printOddNumbersInList(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num%2 != 0)
                .forEach(i -> System.out.print(i + " | "));
    }
}
