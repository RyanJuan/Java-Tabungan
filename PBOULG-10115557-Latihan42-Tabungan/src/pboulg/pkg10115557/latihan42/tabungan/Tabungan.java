/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan42.tabungan;

/**
 *
 * @author RyanJuan
 */
public class Tabungan {
    private int saldo;

    public void Tabungan(int saldo) {
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah){
    int total = saldo-jumlah; 
    return total;    
    }
}
