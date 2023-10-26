package Class9;
/*
Create a 2D array (shorter way) in which first array consist of 4 names and second array will contain grades.
Then your program should print the names of the students that have an A or B grade.
* */

public class T42DArrays {
    public static void main(String[] args) {
        String [][] students={{"Aysha","Giulia","John","Deepali"},{"A","A+","C","B"}};

        for (int i = 0; i < students[0].length; i++) {
            if(students[1][i].equals("A")|| students[1][i].equals("B"))
            System.out.println(students[0][i]);

        }




    }
}