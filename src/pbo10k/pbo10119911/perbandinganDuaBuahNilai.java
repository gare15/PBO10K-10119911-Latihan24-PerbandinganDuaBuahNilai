/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pbo10119911;

import java.util.Scanner;

/**
 *
 * @author tegar
 */
public class perbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int val1, val2;
        
        for (String b= "ya"; b.equals("ya") || b.equals("Ya");){
            Scanner scan = new Scanner(System.in);
            
            System.out.println("==========Program Perbandingan Nilai==========");
            System.out.println();
            System.out.print("Masukkan Nilai Pertama : ");
            val1 = scan.nextInt();
            System.out.print("Masukkan Nilai Kedua : ");
            val2 = scan.nextInt();
            
                if(val1 < val2){
                    System.err.println("Hasil : " + val1 + "lebih kecil dari " + val2);
                }else if(val1 > val2){
                     System.err.println("Hasil : " +val1 + "lebih besar dari " + val2);
                }else if(val1 == val2){
                    System.err.println("Hasil : " +val1 + " sama dengan " + val2 );
                }
                
                    System.err.println();
                    System.out.print("Ulangi Aktivitas ? (Ya/Tidak) ");
                    b = scan.next();
            
        }
    }
    
}
