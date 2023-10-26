package Class9;

public class E52DArrays {
    public static void main(String[] args) {

        int [][] numbers={
                {10,20,30,40},
                {15,30,35,45},
                {16,20,32,22}};

        for (int row = 0; row < numbers.length; row++) {
            for (int columns = 0; columns < numbers[row].length; columns++) {
                System.out.print(numbers[row][columns]+" ");

            }
            System.out.println();

        }
    }
}