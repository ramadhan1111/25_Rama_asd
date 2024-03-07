import java.util.Scanner;

public class MainBarang25 {
    public static void main(String[] args) {
        Barang25[] barangArray = new Barang25[5];
        barangArray[0] = new Barang25("001", "Pensil", 2000, 10);
        barangArray[1] = new Barang25("002", "Buku", 5000, 20);
        barangArray[2] = new Barang25("003", "Pulpen", 3000, 15);
        barangArray[3] = new Barang25("004", "Penghapus", 1000, 30);
        barangArray[4] = new Barang25("005", "Pensil Warna", 4000, 8);

        TransaksiBarang25 transaksi = new TransaksiBarang25();
        for (Barang25 barang : barangArray) {
            transaksi.tambahBarang(barang);
        }

        Scanner scanner = new Scanner(System.in);

        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Daftar Barang");
            System.out.println("2. Tampilkan Daftar Barang Pembelian");
            System.out.println("3. Melakukan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    transaksi.tampilkanBarang();
                    break;
                case 2:
                    transaksi.tampilkanBarangPembelian();
                    break;
                case 3:
                    lakukanPembelian(transaksi, scanner);
                    break;
                case 4:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

        scanner.close();
    }

    public static void lakukanPembelian(TransaksiBarang25 transaksi, Scanner scanner) {
        System.out.print("Masukkan kode barang yang akan dibeli: ");
        String kode = scanner.next();
        transaksi.melakukanPembelian(kode);
    }
}
