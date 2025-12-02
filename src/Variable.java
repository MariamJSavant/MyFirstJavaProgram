public class Variable {
    public static void main(String[] args) {
        // variable = a reusable container for a value
        //              a variable  behaves as if it was the value it contains


        // Primitive = simple value stored directly in memory (stack)
        //Reference = memory address(stack) that points to the (heap)

//        Primitive  vs  Reference
//        ---------      --------
//        int
//        double           array
//        char             object
//        boolean

//        2 Step to creating a variable
//        -------------------------------
//      1. declaration
//      2. assignment

        int age  = 21;
        int year =2025;
        int quantity = 1;


        double price = 19.99;
        double GPA = 3.5;
        double temperature = -12.5;

        char grade ='A';
        char symbol ='!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;

//
//       if(isStudent){
//           System.out.println("You are a student");
//       }else {
//           System.out.println("You are NOT a student");
//       }

        String name = "Mariam Adewunmi";
        String  favoriteFood = "yam";
        String email ="fake123@gmail.com";
        String car = "Mustang";
        String favoriteColor ="red";

        System.out.println("Your choice is a "+favoriteColor+"color"+" "+year+" "+car);
        System.out.println("The price is: "+currency+price);
        if (forSale){
            System.out.println("There is a "+car+" for sale");
        }else {
            System.out.println("There is no "+car+" for sale");
        }


    }

    //Assignment
    //Write 5 variable an int,char,string.boolean.double
    String name =" Bergen";
    int quantity = 5;
    double price = 3500.50;
    char currency = '$';
    boolean isBergen = true;

}
