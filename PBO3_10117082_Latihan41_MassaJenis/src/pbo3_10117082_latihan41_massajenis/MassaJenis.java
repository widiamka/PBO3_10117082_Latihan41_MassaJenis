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
public class MassaJenis {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
   public int hitungVolume(int parSisi){
        return sisi*sisi*sisi;
       
   }
   public int massaJenis(int parMassa, int volume){
        return volume/massa;
       
   }
}
