package Homework;
/*Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
*/

public class HWStudent {
    String getGrade(int num){
        if(num>90){
            return "A";
        } else if (num>80) {
            return "B";
        } else if(num>70){
            return "C";
        }else if(num>50){
            return "D";
        } else{
            return "F";
        }
    }
}
