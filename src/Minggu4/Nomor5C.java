package Minggu4;

import java.util.Scanner;
public class Nomor5C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya data: ");
        int banyakData = input.nextInt();
        int data[] = new int[banyakData];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan Nilai ke-" + (i+1) + " = ");
            data[i] = input.nextInt();
        }

        int nilaiMin = data[0];
        int nilaiMax = data[0];
        int rataRata = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > nilaiMax) {
                nilaiMax = data[i];
            }

            if (data[i] < nilaiMin) {
                nilaiMin = data[i];
            }

            rataRata = rataRata += data[i];
        }
        rataRata = rataRata / data.length;

        System.out.println("\n");
        System.out.println("Nilai Minimum = " + nilaiMin);
        System.out.println("Nilai Maximum = " + nilaiMax);
        System.out.println("Nilai rata-rata = " + rataRata);

    }

}