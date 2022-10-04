package tugas;

// Created by Muhammad Asyrof_21343056

import java.io.BufferedReader; 
import java.io.InputStreamReader; 

public class Tgs1_BufferedReader {
    public static void main(String []args) {
        BufferedReader nilai = new BufferedReader (new InputStreamReader (System.in));
        String a, b, c;
        float nilai1, nilai2, nilai3, rataRata;

        try {
            System.out.print("Masukan nilai pertama :"); 
            a = nilai.readLine();
            nilai1 = Float.parseFloat(a); 

            System.out.print("Masukan nilai kedua :"); 
            b = nilai.readLine(); 
            nilai2 = Float.parseFloat(b); 

            System.out.print("Masukan nilai ketiga :");
            c = nilai.readLine();
            nilai3 = Float.parseFloat(c);

            rataRata = (nilai1+nilai2+nilai3)/3;

            if (rataRata>=60){
                System.out.printf("Selamat anda lulus dengan nilai %.2f :)", rataRata);
            } else {
                System.out.printf("Maaf anda tidak lulus dengan nilai %.2f :(",rataRata);
            }
        } 
        catch (Exception e){
            System.out.println("Maaf nilai yang anda input tidak tersedia");
        } 
    }
}
