package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));

        System.out.println("Print only even numbers:");
        printEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
    }

//    private static boolean isEven(int number) {
//        return number % 2 == 0;
//    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // using Method Reference
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                // .filter(FP01Functional::isEven) // using Method Reference
                .filter(num -> num%2 == 0) // using Lambda expression
                .forEach(System.out::println);
    }
}
