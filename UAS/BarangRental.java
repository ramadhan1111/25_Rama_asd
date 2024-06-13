public class BarangRental {
    String noTNKB;
    String namaKendaraan;
    String jenisKendaraan;
    int tahun;
    int biayaSewa;
    String status;

    public BarangRental(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa, String status) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
        this.status = status;
    }

    public String toString() {
        return String.format("%s | %s | %s | %d | %d | %s", noTNKB, namaKendaraan, jenisKendaraan, tahun, biayaSewa, status);
    }
}
