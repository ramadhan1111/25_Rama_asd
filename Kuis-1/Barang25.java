public class Barang25{
    int stok;
    String nama, kode;
    double harga;

    public Barang25(String kode, String nama, double harga, int stok ){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public double getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public void tampilkanInfo(){
        System.out.println("Kode: "+ kode);
        System.out.println("Nama: "+ nama);
        System.out.println("Harga: "+ harga);
        System.out.println("Stok: "+ stok);
    }
}