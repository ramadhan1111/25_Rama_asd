import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RentalSystem {
    List<BarangRental> barangs = new ArrayList<>();
    List<TransaksiRental> transaksis = new ArrayList<>();
    int totalPendapatan = 0;

    public void tambahBarang(BarangRental barang) {
        barangs.add(barang);
    }

    public void tampilkanBarangs() {
        System.out.println("Daftar Kendaraan:");
        for (BarangRental barang : barangs) {
            System.out.println(barang);
        }
    }

    public BarangRental cariBarang(String noTNKB) {
        for (BarangRental barang : barangs) {
            if (barang.noTNKB.equals(noTNKB)) {
                return barang;
            }
        }
        return null;
    }

    public void buatTransaksi(String kodeBarang, int lamaPinjam, boolean isMember) {
        BarangRental barang = cariBarang(kodeBarang);
        if (barang != null && barang.status.equals("available")) {
            TransaksiRental transaksi = new TransaksiRental(kodeBarang, lamaPinjam, isMember);
            int total = transaksi.hitungTotal(barang);
            transaksis.add(transaksi);
            totalPendapatan += total;
            barang.status = "rented";
            System.out.println("Transaksi berhasil dibuat!");
        } else {
            System.out.println("Kendaraan tidak tersedia atau tidak ditemukan.");
        }
    }

    public void tampilkanTransaksis() {
        System.out.println("Daftar Transaksi:");
        for (TransaksiRental transaksi : transaksis) {
            System.out.println(transaksi);
        }
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }

    public void urutkanTransaksis() {
        transaksis.sort(new Comparator<TransaksiRental>() {
            public int compare(TransaksiRental t1, TransaksiRental t2) {
                BarangRental barang1 = cariBarang(t1.kodeBarang);
                BarangRental barang2 = cariBarang(t2.kodeBarang);
                String nama1 = barang1.namaKendaraan;
                String nama2 = barang2.namaKendaraan;

                if (nama1.charAt(0) >= 'A' && nama1.charAt(0) <= 'M') {
                    return -1 * barang1.noTNKB.compareTo(barang2.noTNKB);
                } else {
                    return -1 * nama1.compareTo(nama2);
                }
            }
        });
        System.out.println("Transaksi berhasil diurutkan!");
    }
}
