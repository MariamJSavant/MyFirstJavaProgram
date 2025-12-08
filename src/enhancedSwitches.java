import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args) {

        //  Enhanced switch : are replacement having many
        //        else if statements it was introduced in (JAVA 14)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.next().toLowerCase();

        switch (day){
            case "monday","tuesday","wednesday","thursday","friday" -> System.out.println(day.toUpperCase() + " is a weekday :* ");
            case "saturday","sunday" -> System.out.println(day + " is weekend enjoy  :) ");
            default -> System.out.println(day + " is not a day");
        }






        scanner.close();

    }
}
