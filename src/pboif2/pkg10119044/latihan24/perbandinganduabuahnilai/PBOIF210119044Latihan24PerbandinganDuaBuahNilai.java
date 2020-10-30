/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan24.perbandinganduabuahnilai;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan perbandingan dua buah
 * nilai yang dimasukkan oleh user
 */

public class PBOIF210119044Latihan24PerbandinganDuaBuahNilai {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pertama,kedua,hasil;
        String aktivitas;
        
        System.out.println("========Program Perbandingan Nilai========");
        do {
            System.out.print("Masukkan nilai pertama : ");
            pertama = input.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            kedua = input.nextInt();
        
            if(pertama>kedua)
                System.out.println("Hasil : "+pertama+" Lebih besar dari "+kedua);
            else if (kedua>pertama)
                System.out.println("Hasil : "+pertama+" Lebih kecil dari "+kedua);
            else
                System.out.println("Hasil : "+pertama+" Sama dengan "+kedua);
            
            System.out.println();
            System.out.print("Ulangi aktivitas ? (Ya/Tidak) : ");
            aktivitas = input.next();
            System.out.println();
        } 
        while (aktivitas.equals("ya") || aktivitas.equals("Ya"));    
    }
}
