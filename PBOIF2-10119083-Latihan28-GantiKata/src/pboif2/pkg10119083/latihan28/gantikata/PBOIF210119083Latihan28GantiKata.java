/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 *  @author
 * Nama : Rafsan Zen Mustaofa
 * NIM  : 10119083
 * Kelas: IF-2
 */
public class PBOIF210119083Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String kalimat, kata, ganti;

        System.out.println("===Program Mengganti Kata===");

        System.out.print("Masukan Kalimat : ");
        kalimat = in.nextLine();

        System.out.print("Ganti Kata : ");
        kata = in.nextLine();

        System.out.print("Menjadi Kata : ");
        ganti = in.nextLine();

        System.out.println("===Hasil Formating===");
        System.out.println("Kata awal : " + kalimat);
        System.out.println("Kata baru : " + kalimat.replace (kata,ganti));
        
        System.out.println("==============================");
        System.out.println("Developed by : Rafsan Zen Mustaofa");
    }
    
}
