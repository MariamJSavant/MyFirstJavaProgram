public class forLoop {
    public static void main(String[] args) throws InterruptedException {
        //for loop excecute some code certain amount of times

        for (int i = 10; i >= 1; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR :) ");
    }
}
