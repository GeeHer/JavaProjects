package Class8;

public class T1Arrays {
    public static void main(String[] args) {
        // Count how many true values are present in array
        boolean [] conds={true,false,true,false,true,false};
        int count=0;
        for (int i = 0; i < conds.length; i++) {
            if(conds[i]){
                count++;
            }

        }
        System.out.println(count);
    }
}
