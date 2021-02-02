/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Pohon {
    //variabel instance
    String nama;
    int tinggi;
    
    //void untuk nama dari inputan user
    void setNama(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama pohon = ");
        nama = input.nextLine();
    }
    //void untuk tinggi dari inputan user
    void setTinggi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama pohon = ");
        tinggi = input.nextInt();
    }
    //nonvoid untuk mengembalikkan nilai
    String getNama(){
        System.out.print("Nama Pohon = ");
        return nama;
    }
    //nonvoid untuk mengembalikkan nilai
    int getTinggi(){
        System.out.print("Tinggi Pohon = ");
        return tinggi;
    }
}