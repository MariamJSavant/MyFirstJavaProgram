import java.util.Scanner;

public class tempConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit?(C or F): ");
        unit = scanner.next().toUpperCase();
//
//        System.out.println(temp);
//        System.out.println(unit); for testing purpose

        //(condition) ? true : false
      newTemp =  (unit.equals("C"))? (temp - 32) * 5 / 9 : (temp *5 / 9) * 32;

        System.out.printf("%.2f %s",newTemp,unit );


        scanner.close();
    }
}
