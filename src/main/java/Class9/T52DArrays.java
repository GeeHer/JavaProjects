package Class9;
/*

* */

public class T52DArrays {
    public static void main(String[] args) {
        String [][] cars={{"Ford","Tesla","Jeep"},{"BMW","Audi","Benz"},{"Kia","Hyundai","Genesis"},
                {"Lamborghini","Ferrari","Maserati"}};

        for (int row = 0; row < cars.length; row++) {
            for (int columns = 0; columns < cars[row].length ; columns++) {
                System.out.print(cars[row][columns]+" ");
            }
            System.out.println();

        }
        System.out.println("========================");

        for(String [] row:cars){
            for(String columns:row){
                System.out.print(columns+" ");
            }
            System.out.println();
        }





    }
}