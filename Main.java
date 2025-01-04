import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
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

        // Convert to uppercase and print
        System.out.println("Strings in uppercase:");
        strings.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        scanner.close();
    }
}
