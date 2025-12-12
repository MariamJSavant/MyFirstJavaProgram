public class searchinInArray {
    public static void main(String[] args) {
        String[] foods ={"rice", "bean", "yam", "egg"};
    System.out.println(foods[0].equals("rice")); // to check is a particular
        // element is in the array
      //using linear search
        for (int i = 0; i < foods.length;i++){
            if (foods[i] == "egg"){
                System.out.println(foods[i] +" in array");
                break;
            }else {
            }
        }
    }
}
