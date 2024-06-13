public class TransaksiRental {
    static int counter = 1;

    int kodeTransaksi;
    String kodeBarang;
    int lamaPinjam;
    boolean isMember;
    int hargaTotal;

    public TransaksiRental(String kodeBarang, int lamaPinjam, boolean isMember) {
        this.kodeTransaksi = counter++;
        this.kodeBarang = kodeBarang;
        this.lamaPinjam = lamaPinjam;
        this.isMember = isMember;
        this.hargaTotal = 0;
    }

    public int hitungTotal(BarangRental barang) {
        int tarif = (barang.jenisKendaraan.equals("motor")) ? 25000 : 40000;

        hargaTotal = lamaPinjam * tarif;

        if (isMember) {
            hargaTotal -= 25000;
        }

        if (lamaPinjam >= 48 && lamaPinjam <= 78) {
            hargaTotal *= 0.9;
        } else if (lamaPinjam > 78) {
            hargaTotal *= 0.8;
        }

        return hargaTotal;
    }

    public String toString() {
        return String.format("%d | %s | %d jam | %s | Total: %d", kodeTransaksi, kodeBarang, lamaPinjam, (isMember ? "Member" : "Non-Member"), hargaTotal);
    }
}
