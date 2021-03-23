package Minggu3;

import java.util.Scanner;

public class Nomor5B {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret yang di inginkan: ");
        int jumlahDeret = inputUser.nextInt();
        for (int i = 1; i <= jumlahDeret; i++) {
            System.out.println(i);
        }

    }
}
