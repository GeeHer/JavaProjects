package Class9;

public class E32DArrays {
    public static void main(String[] args) {

        int [][] numbers={{10,20,30,40},{100,200,303,404},{1,2,3,4}};

        for (int row = 0; row < numbers.length; row++) {
            for (int columns = 0; columns < numbers[row].length; columns++) {
                System.out.print(numbers[row][columns]+" ");

            }
            System.out.println();
        }
    }
}
