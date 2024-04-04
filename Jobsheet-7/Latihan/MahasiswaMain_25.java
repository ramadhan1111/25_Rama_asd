package Latihan;

import java.util.Scanner;

public class MahasiswaMain_25 {
    public static void main(String[] args) {

        Scanner input25 = new Scanner(System.in);
        Scanner input25Line = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.print("Masukkan jumlah mahasiswa   : ");
        int jumlahMahasiswa = input25.nextInt();
        System.out.println("============================================================");

        PencarianMahasiswa_25 data = new PencarianMahasiswa_25(jumlahMahasiswa);

        System.out.println("============================================================");
        System.out.println("                  Masukkan data mahasiswa");
        System.out.println("============================================================");

        for (int i = 0; i < jumlahMahasiswa; i++) {

            System.out.print("Nama\t : ");
            String nama = input25Line.nextLine();
            System.out.print("NIM\t : ");
            int nim = input25.nextInt();
            System.out.print("Umur\t : ");
            int umur = input25.nextInt();
            System.out.print("IPK\t : ");
            double ipk = input25.nextDouble();
            System.out.println("============================================================");

            MahasiswaMain_25 m = new MahasiswaMain_25();
            data.Tambah(m);

        }

        System.out.println("============================================================");
        System.out.println("                 Data keseluruhan mahasiswa");
        System.out.println("============================================================");
        data.Tampil();

        System.out.println("============================================================");
        System.out.println("                  Pencarian data mahasiswa");
        System.out.println("============================================================");
        System.out.print("Masukkan Nama mahasiswa yang ingin dicari : ");
        String cariNama = input25Line.nextLine();

        System.out.println("============================================================");
        System.out.println("               Menggunakan Binary Search");
        System.out.println("============================================================");
        int posisi = data.FindBinarySearch(cariNama, 0, jumlahMahasiswa - 1);

        data.TampilPosisi(posisi);
        data.TampilData(posisi);
    }
}