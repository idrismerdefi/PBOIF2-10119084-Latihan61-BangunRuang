/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan61.bangunruang;
/**
NAMA : MUHAMMAD IDRIS MERDEFI
KELAS : PBOIF2
NIM : 10119084
DESKRIPSI PROGAM : PROGRAM INI BERISI PROGRAM Bangun Ruang
 */
public class PBOIF210119084Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BolaBasket objB = new BolaBasket();
        objB.setR(7);
        System.out.println("Jari-Jari Bola Basket = "+objB.getR()+" cm");
        System.out.printf("Volume Bola Basket = %.1f cm^3 \n",objB.hitungVolume());
        System.out.println("");
        
        Tabung objT = new Tabung();
        objT.setR(10); objT.setT(21);
        System.out.println("Jari-Jari Tabung = "+objT.getR()+" cm");
        System.out.println("Tinggi Tabung = "+objT.getT()+" cm");
        System.out.printf("Volume Tabung = %.1f cm^3 \n",objT.hitungVolume());
        System.out.println("");
        
        Kerucut objK = new Kerucut();
        objK.setR(14);
        objK.setT(9);
        System.out.println("Jari-Jari Tabung = "+objK.getR()+" cm");
        System.out.println("Tinggi Tabung = "+objK.getT()+" cm");
        System.out.printf("Volume Tabung = %.1f cm^3 \n", objK.hitungVolume());
    }
    
}
