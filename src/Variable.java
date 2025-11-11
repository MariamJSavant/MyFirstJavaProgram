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

        System.out.println("The year is "+ year);
        double price = 19.99;
        double GPA = 3.5;
        double temperature = -12.5;
        System.out.println("$ "+price);
        char grade ='A';
        char symbol ='!';
        char currency = '$';
        System.out.println(grade);
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
        System.out.println(isStudent);



    }

}
