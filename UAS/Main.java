import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();

        // Menambahkan data barang
        system.tambahBarang(new BarangRental("B1234ABC", "Yamaha Mio", "motor", 2019, 25000, "available"));
        system.tambahBarang(new BarangRental("B5678DEF", "Toyota Avanza", "mobil", 2020, 40000, "available"));
        system.tambahBarang(new BarangRental("B9101GHI", "Honda Beat", "motor", 2021, 25000, "available"));
        system.tambahBarang(new BarangRental("B1121JKL", "Daihatsu Xenia", "mobil", 2018, 40000, "available"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Tampilkan Barang");
            System.out.println("2. Buat Transaksi");
            System.out.println("3. Tampilkan Transaksi");
            System.out.println("4. Urutkan Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    system.tampilkanBarangs();
                    break;
                case "2":
                    System.out.print("Masukkan kode barang (noTNKB): ");
                    String kodeBarang = scanner.nextLine();
                    System.out.print("Masukkan lama pinjam (jam): ");
                    int lamaPinjam = Integer.parseInt(scanner.nextLine());
                    System.out.print("Apakah member? (y/n): ");
                    boolean isMember = scanner.nextLine().equalsIgnoreCase("y");
                    system.buatTransaksi(kodeBarang, lamaPinjam, isMember);
                    break;
                case "3":
                    system.tampilkanTransaksis();
                    break;
                case "4":
                    system.urutkanTransaksis();
                    break;
                case "5":
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
