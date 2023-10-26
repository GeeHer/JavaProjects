package Class14;

public class T1AccessModifiers {

    int num(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        T1AccessModifiers obj= new T1AccessModifiers();
        int [] array={10,25,15};
        obj.num(array);
        //System.out.println(obj.num(array));
    }

}
