package latihan;

// Created by Muhammad Asyrof_21343056

import java.util.Scanner;

public class PercabanganIF {
    public static void main(String [] args) {
        double total_pembelian, diskon = 0;

        try (Scanner dataMasuk = new Scanner (System.in)) {
            System.out.println("Masukkan Total Pembelian : Rp "); 
            total_pembelian = dataMasuk.nextDouble();
        }
        if (total_pembelian >= 50000) 
            diskon = 0.1 * total_pembelian;

        System.out.println("Besarnya Diskon : Rp " + diskon); 

    } 
}