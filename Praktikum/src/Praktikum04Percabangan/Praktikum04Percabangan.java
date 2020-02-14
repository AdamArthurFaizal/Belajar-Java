/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum04Percabangan;

import java.util.*;

public class Praktikum04Percabangan {

    public static void main(String[] MbahPutih) {

        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int nilai;

        System.out.print("Masukkan nilai = ");
        nilai = inputUser.nextInt();

        if (nilai == 0){
            System.out.println("Mahasiswa tidak mengikuti kuliah");
        }

        if (nilai >= 60){
            System.out.println("Mahasiswa lulus");
            System.out.println("Selamat ya...");
        } else{
            System.out.println("Mahasiswa tidak lulus");
        }

        String kelulusan;

        if (nilai >= 60){
            kelulusan = "LULUS";
        } else{
            kelulusan = "TIDAK LULUS";
        }
        System.out.println("Mahasiswa dinyatakan " + kelulusan);

        if (nilai < 60){
            kelulusan = "TIDAK LULUS";
        } else {
            kelulusan = "LULUS";
        }
        System.out.println("Mahasiswa dinyatakan " + kelulusan);

        char konversi;
        if(nilai < 59){
            konversi = 'C';
        } else if(nilai < 80){
            konversi = 'B';
        } else{
            konversi = 'A';
        }
        System.out.println("Konversi nilai = " + konversi);

        String status;

        if((nilai >= 0) && (nilai <= 100)){
            status = "VALID";
        } else{
            status = "TIDAK VALID";
        }
        System.out.println("Status nilai : " + status);
        System.out.println("\n");

        int pilih;
        String kata = "Tidak ada";

        System.out.println("1. Pilih satu");
        System.out.println("2. Pilih dua");
        System.out.println("3. Pilih tiga");
        System.out.print("Masukkan pilihan kamu = ");
        pilih = inputUser.nextInt(); inputUser.nextLine();

        int harga = 0;
        switch (pilih){
            case 1:
                kata = "Satu";
                harga = 10;
                    break;
            case 2:
                kata = "Dua";
                harga = 20;
                    break;
            case 3:
                kata = "Tiga";
                harga = 30;
                    break;
//            default:
//                kata = "Tidak memilih ketiganya";
//                harga = 0;
        }
        System.out.println("Pilihan kamu : " + kata + harga);






    }
}
