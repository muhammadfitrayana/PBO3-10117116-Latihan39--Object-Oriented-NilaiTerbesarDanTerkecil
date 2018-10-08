/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan39.objectoriented.nilaiterbersardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Nilai Terbesar dan Terkecil berbasis 
 * objek
 *  
 */
public class PBO310117116Latihan39ObjectOrientedNilaiTerbersarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String namaPetugas;
        int jmlMahasiswa;

        BesarKecil hasil = new BesarKecil();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jmlMahasiswa = scn.nextInt();
        System.out.println();

        hasil.inputNilai(jmlMahasiswa);
        System.out.println();
        hasil.tampilNilaiTerbesarTerkecil(jmlMahasiswa);

        System.out.println("Nilai Terbesar : " + hasil.nilaiBesar);
        System.out.println("Nilai Terkecil : " + hasil.nilaiKecil);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
    
}
