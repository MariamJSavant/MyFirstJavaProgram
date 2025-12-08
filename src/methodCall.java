import java.util.Scanner;

public class methodCall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (ageCheck(age)){
            System.out.println("You are eligible to sign up");
        }else {
            System.out.println("GO back home kid and wait patiently for 18 :)");
        }
        scanner.close();
    }
    static boolean ageCheck(int age){
        if(age >=  18){
            return true;
        }else {
            return false;
        }
    }
}
