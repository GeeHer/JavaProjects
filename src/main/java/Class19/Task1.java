package Class19;

public class Task1 {
    public int minimum(int num1,int num2) {
        //return num1<num2?num1:num2; // ternary operator
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
        public double minimum(double num1,double num2){
            if(num1<num2){
                return num1;
            } else{
                return num2;
            }
    }
}
