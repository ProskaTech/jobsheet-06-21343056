package tugas;

// Created by Muhammad Asyrof_21343056

import javax.swing.JOptionPane;

public class Tgs1_JOptionPane {
    public static void main(String []args) {
        String a = JOptionPane.showInputDialog("Masukkan nilai ke-1");
        String b = JOptionPane.showInputDialog("Masukkan nilai ke-2");
        String c = JOptionPane.showInputDialog("Masukkan nilai ke-3");

        int nilai1 = Integer.parseInt(a);
        int nilai2 = Integer.parseInt(b);
        int nilai3 = Integer.parseInt(c);

        int rataRata = (nilai1+nilai2+nilai3)/3;

        if (rataRata>=60){
            String pesan1 = "Selamat anda lulus dengan nilai " + rataRata + " :)";
            JOptionPane.showMessageDialog(null, pesan1);
        } else {
            String pesan2 = "Maaf anda tidak lulus dengan nilai " + rataRata + " :(";
            JOptionPane.showMessageDialog(null, pesan2);
        }
        
    }
}
