import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input student names
        List<String> students = new ArrayList<>();
        System.out.println("Enter the names of the students:");
        for (int i = 0; i < n; i++) {
            students.add(scanner.nextLine());
        }

        // Input the filter letter
        System.out.println("Enter the starting letter to filter students:");
        String filterLetter = scanner.nextLine();

        // Filter students whose names start with the given letter
        List<String> filteredStudents = students.stream()
                .filter(name -> name.startsWith(filterLetter))
                .collect(Collectors.toList());

        // Print filtered students
        System.out.println("Students whose names start with '" + filterLetter + "': " + filteredStudents);

        scanner.close();
    }
}
