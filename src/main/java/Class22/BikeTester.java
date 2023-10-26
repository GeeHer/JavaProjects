package Class22;

public class BikeTester {


    public void maxValue(int[] arr) {
        int largestNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                largestNum=arr[i];

            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        //System.out.println(maxValue(arr)); //should print 22
    }

}