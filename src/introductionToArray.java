public class introductionToArray {
    public static void main(String[] args) {
        //Array is a collection of value of the same datatype.
        // think of it as a variable that can store more than one value

        String [] fruits = {"apple", "orange", "coconut", "pear"};
        System.out.println(fruits[0]); //apple is at index 0
        System.out.println(fruits.length); //length is 4 items
        //ITERAION
        //Usinf for loop
      for (int i = 0; i < fruits.length; i++){
          //iterating and printing out all item in the array
          System.out.print(" " + fruits[i]);
      }
        System.out.println();
      //using forEach loop
      for (String fruit : fruits){

          System.out.print(fruit + " ");
      }
    }

}
