package Class7;

public class T9Arrays {
    public static void main(String[] args) {
        int [] num={20,10,50,30,40};

        int sum=0;
        for (int i = 0; i <num.length ; i++) {
            sum=sum+num[i]; // pick the previous value of sum and add it to current value of array

        }
        System.out.println(sum);



    }
}
