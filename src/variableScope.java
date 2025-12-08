public class variableScope {
    static int x = 3 ; //Class variable because it's declared within a class
    public static void main(String[] args) {
        //variable scope is where a variable can be accessed
        //LOCAL VARIABLE = variable declare within a method
        //CLASS VARIABLE = variable declare inside a class

//        int x = 2; //Local variable because it's declared inside the main method
        //local variable are prioritised first
//        System.out.println(x);
        printX(x);


    }
    static void printX(int x){
        System.out.println(x);
    }
}
