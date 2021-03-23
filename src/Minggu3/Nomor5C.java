package Minggu3;

public class Nomor5C {
    public static void main(String[] args) {
        // deklarasi array di dalam array
        int array2d[][] = {
                {5, 6, 1, 7},
                {8, 1, 2, 9},
                {5, 4, 7, 1},
                {8, 3, 7, 5}
        };

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j] + ", ");
            }
            System.out.println(" ");
        }

    }
}
