public class overloadedMethod {
    public static void main(String[] args) {

        System.out.println(bakePizza("Flat bread"));
        System.out.println(bakePizza("Flat bread","mozzarella"));
        System.out.println(bakePizza("Flat bread","mozzarella","pepperoni"));

    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese +" "+ bread + " pizza";
    }
    static String bakePizza(String bread, String cheese,String toppings){
        return toppings +" "+ cheese +" "+ bread + " pizza";
    }

}
