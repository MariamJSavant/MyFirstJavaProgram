import java.util.Scanner;

public class logicalOperator {
    public static void main(String[] args) {
        // && - AND
        // || - OR
        // ! -NOT

        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.print("Enter your Username: ");
        username = scanner.nextLine();

        if(username.length() >= 4 && username.length()  <=12 ){
            if (username.contains(" ") || username.contains("_")){
                System.out.println("Username can't contain space or underscore");
            }else {
                System.out.println("Hello "+username);
            }
        }else{
            System.out.println("Nah your password most be between 4-12");
        }
        scanner.close();

    }
}
