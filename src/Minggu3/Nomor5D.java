package Minggu3;

import java.util.Scanner;

public class Nomor5D {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        System.out.println("------------------------------------------");
        System.out.println("\t\t Kharisma Agung Plaza (KAP)");
        System.out.println("\t\t    Promo Belanja Berhadiah");
        System.out.println("\t Khusus Pembelian Barang Pertama");
        System.out.println("\tDengan harga Minimum Rp. 10.000.00");
        System.out.println("------------------------------------------");
        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = userInput.nextLine();

        System.out.print("Masukkan harga barang 1 :");
        long barang1 = userInput.nextLong();
        System.out.print("Masukkan harga barang 2 :");
        long barang2 = userInput.nextLong();
        System.out.print("Masukkan harga barang 3 :");
        long barang3 = userInput.nextLong();
        System.out.print("Masukkan harga barang 4 :");
        long barang4 = userInput.nextLong();
        System.out.print("Masukkan harga barang 5 :");
        long barang5 = userInput.nextLong();

        long totalHarga = barang1 + barang2 + barang3 + barang4 + barang5;
        System.out.println("Total harga pembelian atas nama " + namaPembeli + " adalah Rp. " + totalHarga);

        if (barang1 >= 10_000 &&
            barang2 >= 10_000 &&
            barang3 >= 10_000 &&
            barang4 >= 10_000 &&
            barang5 >= 10_000) {
            System.out.println("Selamat .... \n anda mendapat hadiah 1 buah mug cantik");
        } else {
            System.out.println("Sayang sekali anda belum mendapat hadiah");
        }
        System.out.println("------------------------------------------");
        System.out.println("\t\t\t Terimakasih");
        System.out.println("Anda sudah belanja di Kharisma Agung Plaza");

    }
}
