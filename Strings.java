import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of strings
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input the strings
        List<String> strings = new ArrayList<>();
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }

        // Filter non-empty strings and print
        System.out.println("Non-empty strings:");
        strings.stream()
                .filter(str -> !str.isEmpty())
                .forEach(System.out::println);

        scanner.close();
    }
}
