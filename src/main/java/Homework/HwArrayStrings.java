package Homework;

public class HwArrayStrings {
    public static void main(String[] args) {
        String [] words={"Java","Saturday","day","coding","is"};
        System.out.println(words[1]+" "+words[4]+" " + words[0]+" "+words[3]+" "+words[2]+".");

        String [] cars={"BMW","Mercedez","Toyota","Tesla","Honda","Ford"};
        for (int i = 0; i < cars.length ; i++) {
            System.out.print(cars[i] + " ");
        }
            System.out.println();

            int j=0;
            while(j< cars.length){
                System.out.print(cars[j]+" ");
                j++;}
        System.out.println();

        String [] animals={"Dog","Cat","Hamster","Tiger","Hippo"};
        for (int i = 0; i < animals.length ; i++) {
            System.out.print(animals[i]+" ");
        }
        System.out.println();
        int k=0;
        while(k< animals.length){
            System.out.print(animals[k]+" ");
            k++;
        }
    }
}

