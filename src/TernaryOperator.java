public class TernaryOperator {
    public static void main(String[] args) {
        //ternary operator ? = Return  1 of two values is a connection is true or not

        //variable = (condition) ? ifTrue : ifFail
 //       if (score >= 60){
//            System.out.println("You pass! ");
//        }else {
//            System.out.println("Fail");
//        }
//        int score = 50;
//        String passsOrFail = (score >=60) ? "PASS" : "FAIL";

//        int number = 4;
//
//        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
//
//        System.out.println(evenOrOdd);

//        int hours = 13;
//        String timeOfDay = (hours < 12) ? "A.M." :"P.M.";
//        System.out.println(timeOfDay);

        int income = 60000;
        double taxRate = (income >=40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

    }
}
