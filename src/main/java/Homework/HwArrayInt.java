package Homework;

public class HwArrayInt {
    public static void main(String[] args) {
        int [] num={5,3,8,26,13};
        int sum=0;

        for (int l = 0; l < num.length; l++) {
            sum=sum+num[l];
        }
        System.out.println(sum);


        int largestNumber=num[0];
        for (int m = 0; m < num.length; m++) {
            if(num[m]>largestNumber){
                largestNumber=num[m];
            }
        }
        System.out.println(largestNumber);
    }
}
