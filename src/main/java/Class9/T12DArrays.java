package Class9;

public class T12DArrays {
    public static void main(String[] args) {
    // Print only the even numbers from this array
        int [][] numbers={{10,20,30,40},{100,200,303,404},{1,2,3,4}};

        for (int row = 0; row < numbers.length; row++) {
            for (int columns = 0; columns < numbers[row].length; columns++) {
                if(numbers[row][columns]%2 !=0)
                System.out.print(numbers[row][columns]+" ");}
            System.out.println();
        }
    }
}
