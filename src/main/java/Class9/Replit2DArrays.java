package Class9;

public class Replit2DArrays {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 1, 2}, {3, 1, 2}, {3, 5, 3}, {0, 1, 2}};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr1[i].length; j++) {
                sum = arr1[i][j] + sum;
                arr2[i] = sum;
            }
        }
        for (int n : arr2) System.out.println(n);
    }
}
