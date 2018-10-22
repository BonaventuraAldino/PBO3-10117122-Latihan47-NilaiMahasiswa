/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan47.nilaimahasiswa;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Program dibuat untuk menghitung nilai akhir mahasiswa 
 *                     dan menentukan indeks nilai sesuai nilai akhir mahasiswa.
 */
public class PBO310117122Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Index object1 = new Index();
        object1.setQuis(75.0);
        object1.setUts(45.0);
        object1.setUas(34.0);
        System.out.println("QUIZ\t= " + object1.getQuis());
        System.out.println("UTS\t= "  + object1.getUts());
        System.out.println("UAS\t= "  + object1.getUas());
        System.out.println("");
        System.out.println("Nilai Akhir = " + object1.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
        
        Index object2 = new Index();
        object2.setQuis(60.0);
        object2.setUts(80.0);
        object2.setUas(75.0);
        System.out.println("QUIZ\t= " + object2.getQuis());
        System.out.println("UTS\t= "  + object2.getUts());
        System.out.println("UAS\t= "  + object2.getUas());
        System.out.println("");
        System.out.println("Nilai Akhir = " + object2.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
        
        Index object3 = new Index();
        object3.setQuis(30.0);
        object3.setUts(80.0);
        object3.setUas(40.0);
        System.out.println("QUIZ\t= " + object3.getQuis());
        System.out.println("UTS\t= " + object3.getUts());
        System.out.println("UAS\t= " + object3.getUas());
        System.out.println("");
        System.out.println("Nilai Akhir = " + object3.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
    }
    
}
