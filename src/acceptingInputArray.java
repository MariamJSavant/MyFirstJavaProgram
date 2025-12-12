import java.util.Scanner;

public class acceptingInputArray {
    public static void main(String[] args) {
        //A Grocery Cart program
        //Enter the number of item you want to put in your cart
        //Enter each item
        //All the item will be printed out
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome TO Wall Mart");
        System.out.println("Enter the number of item you want to put in your cart\n" +
                "        Enter each item\n" +
                "        All the item will be received");
        System.out.print("Number of item you want to purchase: ");
        int numberOfItem = scanner.nextInt();
        scanner.nextLine();
        String[]itemInCart=new String[numberOfItem];
       if (itemInCart.length > 0){
           for (int i = 0; i < itemInCart.length;i++){
               System.out.print("Enter item: ");
               itemInCart[i]=scanner.nextLine();
           }
       }else {
           System.out.println("Item must be greater than 0");
       }
        System.out.println("Here is your invoice");
       for (String item : itemInCart){
           System.out.print(item + " ,");

       }





        scanner.close();
    }
}
