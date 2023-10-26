package Class9;

public class E12DArrays {
    public static void main(String[] args) {
        String [][]names= {{"Hind","Mikhail","Ismael","Ahmed"},{"Avis","Giula","Ace","Mohammad"},
                {"Deepali","Tamin","Tahmin","John"},{"Joke","Laugh","Chuckel","Funny"}};


        String[] row=names[2];
       // System.out.println(row[3]);
       // System.out.println(Arrays.toString(row));

        for(String name:row){
            System.out.println(name);
        }

    }
}
