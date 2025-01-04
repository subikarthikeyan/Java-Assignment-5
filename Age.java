import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthDateInput = scanner.nextLine();

        try {
            LocalDate birthDate = LocalDate.parse(birthDateInput);
            LocalDate currentDate = LocalDate.now();

            // Check if birthdate is in the future
            if (birthDate.isAfter(currentDate)) {
                System.out.println("Birthdate cannot be in the future.");
            } else {
                Period age = Period.between(birthDate, currentDate);
                System.out.println("Your age is: " + age.getYears() + " years, "
                        + age.getMonths() + " months, and " + age.getDays() + " days.");
            }
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-mm-dd.");
        }

        scanner.close();
    }
}
