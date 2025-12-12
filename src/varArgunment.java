public class varArgunment {
    public static void main(String[] args) {
        //allowing a method  to accept a varing argunment
        // ,which makes the method mor flexible no need for overloaded methods
        System.out.println(add(2,3,5));
        System.out.println(add(2,4,5));
    }
    static  int add(int ...numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }
    static  int subtract(int ...numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length;i++){
            sum-=numbers[i];
        }
        return sum;
    }
}
