import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FullDateConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();


        LocalDate date = LocalDate.parse(shortDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, uuuu");
        String fullDate = date.format(formatter);

     
        String dayOfWeek = date.getDayOfWeek().toString();

        dayOfWeek = dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1).toLowerCase();


        System.out.println(dayOfWeek + " " + fullDate);

        scanner.close();
    }
}
