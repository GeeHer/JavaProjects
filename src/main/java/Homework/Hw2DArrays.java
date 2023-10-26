package Homework;
/*Using 2D array create a grocery list.Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops.
 */

public class Hw2DArrays {
    public static void main(String[] args) {
        String [][] groceries={{"Carrots","Tomatoes","Onions","Potatoes"},{"Apple","Pears","Grape","Orange"},
                {"Milk","Cheese","Eggs","Butter"},{"Candy","Syrup","Sugar","Soda"}};

        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.print(groceries[i][j]+" ");
            }
            System.out.println();
        }
       for(String [] row:groceries){
           for(String columns:row)
           System.out.print(columns+" ");
           System.out.println();
       }
    }
}
