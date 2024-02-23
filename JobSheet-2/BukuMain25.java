public class BukuMain25 {
    public static void main (String[] args) {
        Buku25 bk1 = new Buku25();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku25 bk2 = new Buku25("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku25 bukuRamadhan = new Buku25("Ancika", "Pidi Baiq", 350, 50, 80000);
        bukuRamadhan.tampilInformasi();

        int jumlahTerjual = 5;
        int hargaTotal = bukuRamadhan.hitungHargaTotal(jumlahTerjual);
        int diskon = bukuRamadhan.hitungDiskon(hargaTotal);
        int hargaBayar = bukuRamadhan.hitungHargaBayar(hargaTotal, diskon);

        System.out.println("Jumlah terjual : " + jumlahTerjual);
        System.out.println("Harga total: Rp " + hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga bayar: Rp " + hargaBayar);
    }
}
