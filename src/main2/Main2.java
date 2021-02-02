/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;

/**
 *
 * @author MOKLET-2
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pohon cemara, jati;
        
        //judul
        System.out.println("SELAMAT DATANG DI DATA POHON SERBAGUNA");
        
        //object
        Pohon tampil = new Pohon();
        
        //mendeklarasikan void dan no void
        tampil.setNama();
        tampil.setTinggi();
        System.out.println("====================================================");
        System.out.println(tampil.getNama());
        System.out.println(tampil.getTinggi());
    }
    
}
