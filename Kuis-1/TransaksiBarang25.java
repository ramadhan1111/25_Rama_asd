import java.util.ArrayList;

public class TransaksiBarang25 {
    private ArrayList<Barang25> barangs = new ArrayList<>();

    public void tambahBarang(Barang25 barang) {
        barangs.add(barang);
    }

    public void tampilkanBarang() {
        System.out.println("Daftar Barang:");
        for (Barang25 barang : barangs) {
            barang.tampilkanInfo();
            System.out.println("-------------------");
        }
    }

    public void tampilkanBarangPembelian() {
        System.out.println("Daftar Barang Pembelian:");
        for (Barang25 barang : barangs) {
            if (barang.getStok() < 5) { // Contoh: Hanya menampilkan barang yang stoknya kurang dari 5
                barang.tampilkanInfo();
                System.out.println("-------------------");
            }
        }
    }

    public void melakukanPembelian(String kodeBarang) {
        for (Barang25 barang : barangs) {
            if (barang.getKode().equals(kodeBarang)) {
                if (barang.getStok() > 0) {
                    System.out.println("Pembelian berhasil: " + barang.getNama());
                    barang.setStok(barang.getStok() - 1);
                } else {
                    System.out.println("Stok barang tidak mencukupi.");
                }
                return;
            }
        }
        System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan.");
    }
}
