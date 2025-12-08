import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";

//  STANDARD WHILE LOOP -      while (name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }

        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
     }while (name.isEmpty());

        System.out.println("Hello "+name);

        scanner.close();
    }
}
