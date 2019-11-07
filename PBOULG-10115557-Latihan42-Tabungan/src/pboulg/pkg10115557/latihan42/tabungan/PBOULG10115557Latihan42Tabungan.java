/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author RyanJuan
 * NAMA              : RAYAN
 * KELAS             : PBOULG
 * NIM               : 10115557
 * Deskripsi Program : Menampilkan Program penarikan uang dari tabungan  
 */
public class PBOULG10115557Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scn = new Scanner(System.in);
        int D;
        System.out.println("====Program Penarikan Uang====");
        Tabungan T = new Tabungan();
        
        System.out.printf("Masukan Saldo Awal : ");
        T.Tabungan(scn.nextInt());
        System.out.printf("Jumlah uang yang akan diambil : ");
        D = scn.nextInt();
       
        System.out.println("Saldo Anda Sekarang : "+ T.ambilUang(D));
    }
    
}
