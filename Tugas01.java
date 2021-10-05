import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~ PROGRAM PERHITUNGAN MATRIKS ~~~~~~~");

        int Jumlah = 0,i,j;

        int matriks1 [][] = new int[2][2];
        int matriks2 [][] = new int[2][2];
        int Hasil [][] = new int[2][2];
        int pilihan;

        System.out.println("Perhitungan Matriks : ");
        System.out.println("1. Penjumlahan Matriks");
        System.out.println("2. Pengurangan Matriks");
        System.out.print("MASUKKAN PILIHAN : ");
        pilihan = input.nextInt();

        System.out.println("INPUT MATRIKS 1");
        for (i=0;i<2;i++)//i untuk input baris j untuk input kolom
        {
            for (j=0;j<2;j++)
            {

                System.out.print("baris ke - " +(i+1)+" kolom ke- = " +(j+1));
                matriks1[i][j] = input.nextInt();
            }
        }

        System.out.println("INPUT MATRIKS 2");
        for (i=0;i<2;i++)//i untuk input baris j untuk input kolom
        {
            for (j=0;j<2;j++)
            {

                System.out.print("baris ke - " +(i+1)+" kolom ke- = " +(j+1));
                matriks2[i][j] = input.nextInt();
            }
        }

        if (pilihan == 1)
        {
            System.out.println("PENJUMLAHAN MATRIKS");
            System.out.println("HASIL PENJUMLAHAN : ");

            for (i=0; i < 2; i++)
            {
                for (j=0; j < 2; j++)
                {
                  Hasil[i][j] = matriks1[i][j] + matriks2[i][j];

                    System.out.print(Hasil[i][j] + "\t ");
                }
                System.out.println();
            }
        }
        else if (pilihan == 2)
        {
            System.out.println("PENGURANGAN MATRIKS");
            System.out.println("HASIL PENGURANGAN : ");

            for (i=0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    Hasil[i][j] = matriks1[i][j] - matriks2[i][j];

                    System.out.print(Hasil[i][j] + "\t");
                }
            }
            System.out.println();
        }
        else {
            System.out.println("Input Salah !");
        }

    }

}
