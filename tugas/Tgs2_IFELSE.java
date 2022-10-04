package tugas;

// Created by Muhammad Asyrof_21343056

import java.util.Scanner;

public class Tgs2_IFELSE {
    public static void main(String [] args) {
        Scanner inputGrade = new Scanner(System.in);
        int grade;

        System.out.print("Masukkan Nilai = ");
        grade = inputGrade.nextInt();

        if (grade == 10) {
            System.out.println("sepuluh");
        }
        else if (grade == 9){
            System.out.println("sembilan");
        }
        else if (grade == 8){
            System.out.println("delapan");
        }
        else if (grade == 7){
            System.out.println("tujuh");
        }
        else if (grade == 6){
            System.out.println("enam");
        }
        else if (grade == 5){
            System.out.println("lima");
        }
        else if (grade == 4){
            System.out.println("empat");
        }
        else if (grade == 3){
            System.out.println("tiga");
        }
        else if (grade == 2){
            System.out.println("dua");
        }
        else if (grade == 1){
            System.out.println("satu");
        }
        else{
            System.out.println("Invalid Number");
        }
        inputGrade.close();

    } 
}