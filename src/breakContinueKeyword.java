public class breakContinueKeyword {
    public static void main(String[] args) {

        //BREAK = break out of a loop (in other word STOP the entire loop)
        //CONTINUE= skip that particular segment of the loop
        for(int i = 0; i <=10;i++){
//            if (i == 5){
//                break;
//            }
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
