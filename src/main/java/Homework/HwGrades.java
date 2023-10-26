package Homework;
/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine
the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F */


import java.util.Scanner;

public class HwGrades {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your quiz grade.");
        int quiz=scanner.nextInt();
        System.out.println("Please enter your mid term grade.");
        int midTerm= scanner.nextInt();
        System.out.println("Please enter your final score.");
        int finalGrade= scanner.nextInt();
        int result=(quiz+midTerm+finalGrade)/3;

        if (result>=90 && result<=100){
            System.out.println("A");
        }else if(result>=70 && result<=90){
            System.out.println("B");
        }else if(result>=50 && result<=70){
            System.out.println("C");
        }else if(result>=0 && result<=50){
            System.out.println("F");
        }


    }
}
