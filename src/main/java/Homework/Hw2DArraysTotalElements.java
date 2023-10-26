package Homework;
/*Create 2D array of countries: north america countries, south america countries, europe countries, asian countries,
african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored.*/

public class Hw2DArraysTotalElements {
    public static void main(String[] args) {
        String[][] countries = {{"Canada", "USA", "Mexico"}, {"Brazil", "Argentina", "Chile", "Peru", "Colombia"},
                {"France", "Italy", "Germany", "Greece"}, {"China", "Japan", "Vietnam"}, {"South Africa", "Ghana",
                "Cameroon"}};

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
            }
            System.out.println();
        }
        for (String[] row : countries) {
            for (String columns : row) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }

        int total=0;
        for (int i = 0; i < countries.length; i++) {
            total=total+countries[i].length;
            }
        System.out.println(total);
    }
}
