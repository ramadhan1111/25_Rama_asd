

public class Mahasiswa {
    //atribute
    int nim;
    String nama;
    int umur;
    double ipk;

    //konstruktor berparameter
    Mahasiswa(int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    //fungsi tampil untuk menampilkan semua atribute
    void tampil(){
        System.out.println("NIM\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur);
        System.out.println("IPk\t: " + ipk);
    }
}
//@widyaIn