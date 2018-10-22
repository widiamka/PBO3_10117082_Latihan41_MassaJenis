/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan41_massajenis;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan hasil 
* perhitungan volume dan massa jenis dengan massa dan sisi yang sudah ditentukan
 */
public class PBO3_10117082_Latihan41_MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MassaJenis mj = new MassaJenis();
         mj.setSisi(5);
        mj.setMassa(2);

        System.out.println("=====MASSA JENIS KUBUS=====");
        System.out.println("Sisi : "+mj.getSisi());
        System.out.println("Massa : "+mj.getMassa()+"\n");
       
        System.out.println("======HASIL PERHITUNGAN=====");
        System.out.println("Volume : "+mj.hitungVolume(5));
        System.out.println("Massa Jenis : "+mj.massaJenis(2, 5));
        
    }
    
}
