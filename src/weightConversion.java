import java.util.Scanner;

public class weightConversion {
    public static void main(String[] args) {
        //WEIGHT CONVERSION PROGRAM

        //Declare variables
        //Welcome message
        //prompt for user input
        //option one convert lbs to kgs
        //option two convert kgs to lbs
        //else print nota valid choice
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int inputChoice;


        System.out.println("Weight Conversion Program \n 1: Convert lbs to kgs \n 2: Convert kgs to lbs");

        System.out.print("Choose an Option: ");
        inputChoice = scanner.nextInt();
//        System.out.println(inputChoice); test purpose


        if (inputChoice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The weight in kgs is %.2f ",newWeight);

        }
        else if (inputChoice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The weight in lbs is %.2f ",newWeight);

        }else {
            System.out.println("Enter a valid choice");
        }

scanner.close();

    }
}
