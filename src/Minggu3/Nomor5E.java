package Minggu3;

import java.util.Scanner;

public class Nomor5E {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("\t\t CAFE CERIA");
        System.out.println("\t ANEKA MINUMAN");
        System.out.println("-------------------------");
        System.out.println("\t SPESIAL MENU: ");
        System.out.println("1. Soft Drink");
        System.out.println("2. Mix Juice ");
        System.out.println("3. Nexcafe");
        System.out.println("4. Soda Milk");
        System.out.println("5. Tea");
        System.out.println("-------------------------");

        System.out.print("Masukkan Nama pembeli: ");
        String namaPembeli = userInput.nextLine();

        System.out.print("Masukkan pilihan anda: ");
        int menuPilihan = userInput.nextInt();
        String hasilPilihan = "";
        switch (menuPilihan) {
            case 1: hasilPilihan = "Soft Drinks";
            break;
            case 2: hasilPilihan = "Mix Juice";
            break;
            case 3: hasilPilihan = "Nexcafe";
            break;
            case 4: hasilPilihan = "Soda milk";
            break;
            case 5: hasilPilihan = "Tea";
            break;
        }

        System.out.println("Minimun yang anda pesan adalah " + hasilPilihan);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terimakasih " + namaPembeli + " telah berkunjung di Cafe Ceria");

    }
}
