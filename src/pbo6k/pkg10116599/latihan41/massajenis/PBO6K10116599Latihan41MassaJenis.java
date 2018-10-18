/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan41.massajenis;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program untuk menghitung volume dan massa jenis kubus,
 *                      dengan memasukkan nilai pada sisi dan massanya.
 * 
 */
public class PBO6K10116599Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Inisialisasi kubus
        Kubus okubus = new Kubus();
        okubus.setSisi(5);
        okubus.setMassa(250);
        
        // Input nilai sisi dan masssa kubus
        System.out.println("====== Massa Jenis Kubus ======");
        System.out.println("Sisi\t: " +okubus.getSisi());
        System.out.println("Massa\t: " +okubus.getMassa());
        System.out.println();
        
        // Output hasil perhitungan
        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Volume\t\t: " +okubus.hitungVolume(okubus.getSisi()));
        System.out.println("Massa Jenis\t: " +okubus.hitungMassaJenis(okubus.getMassa(), okubus.hitungVolume(0)));
        
    }
    
}
