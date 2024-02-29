public class DataUser {
    private String nama;
    private int usia;
    private String pekerjaan;

    public DataUser(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }
}
