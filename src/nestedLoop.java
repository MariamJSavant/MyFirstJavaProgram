import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        //Nested loop =A loop inside another loop use often for metrics and DSA

        Scanner scanner = new Scanner(System.in);

        int row;
        int column;
        char symbol;

        System.out.print("Enter the number of rows: ");
        row = scanner.nextInt();
        System.out.print("Enter the number of column: ");
        column = scanner.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = scanner.next().charAt(0);

        for (int i =1; i <=row;i++){
            for (int j = 1 ; j <=column;j++){
                System.out.print(symbol);
            }
            System.out.println();

        }


        scanner.close();
    }
}
