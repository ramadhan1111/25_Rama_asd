import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);
    static TransaksiDanRekening data = new TransaksiDanRekening();
    public static void main(String[] args) {
        dataRek();
        dataTransaksi();
        menu();
    }
    public static void menu(){
        System.out.println("\t\t-- Rama Bank --");
        System.out.println("(1) Tampilkan data rekening");
        System.out.println("(2) Tampilkan data transaksi");
        System.out.println("(3) Mencari saldo < 500.000");
        System.out.println("(4) Mencari data > nomor rekening");
        System.out.println("(5) Sorting dari nama");
        System.out.println("(6) Keluar");
        System.out.print("Masukkan nomor pilihan:  ");
        int nomorPilihan = userInput.nextInt();

        switch(nomorPilihan){
            case 1:
                data.tunjukkanRekening();
                menu();
                break;
            case 2:
                data.tunjukkanTransaksi();
                menu();
                break;
            case 3:
                System.out.println("\t\t\t>>Data Saldo di bawah 500000<<");
                data.FindSeqSearch(500000);
                menu();
                break;
            case 4:
                findNoRekening();
                menu();
                break;
            case 5:
                boolean bool = sortBy();
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Mengurutkan data berdasarkan nama > " + (bool ? "Descending" : "Ascending"));
                System.out.println("-----------------------------------------------------------------------------");
                data.sorting(bool);
                data.tunjukkanRekening();
                menu();
                break;
            case 6:
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Terimakasih telah mengunjungi bank kami :)");
                System.out.println("-----------------------------------------------------------------------------");
                break;
            default:
                System.out.println("Pilihan tidak ditemukan");
                menu();
        }
    }
    public static void dataRek(){
        Rekening25 rek1 = new Rekening25("160309273084", "bin Abdul Salam", "Aruffin", "14582643263", "ligula.Nullam@tacitisociosqu.edu");
        Rekening25 rek2 = new Rekening25("169712042416","Al Hafeezy", "Mohammad", "16834168323", "ut.pellentesque@luctusutpellentesque.com");
        Rekening25 rek3 = new Rekening25("161007278862","bin Azzarudin", "Ehsan", "6505379", "Proin.eget@velitegestaslacinia.ca");
        Rekening25 rek4 = new Rekening25("161807297229","Fadhullah", "Jeanne Roselia", "8638209", "Pellentesque.ut.ipsum@neque.ca");
        Rekening25 rek5 = new Rekening25("169503136823","Nohara", "Shinnosuke", "5926919", "tellus.justo.sit@commodoauctor.net");
        Rekening25 rek6 = new Rekening25("168507083528","Nohara", "Hiroshi", "11153397678", "dictum@nec.edu");
        Rekening25 rek7 = new Rekening25("160802059329","Nohara", "Misae", "18917032664", "vel@ullamcorpermagna.co.uk");
        Rekening25 rek8 = new Rekening25("160806282695","Nohara", "Himawari", "19786325110", "Aliquam.gravida@vestibulumMauris.net");
        Rekening25 rek9 = new Rekening25("161309092979","Nobi", "Nobita", "8171766", "interdum.Curabitur.dictum@rutrumurna.edu");
        Rekening25 rek10 = new Rekening25("168902128688","Takeshi", "Goda", "16754004501", "et.ultrices@a.co.uk");
        Rekening25 rek11 = new Rekening25("161410089963","Kudo", "Shinichi", "5279085", "ut@aultriciesadipiscing.ca");
        Rekening25 rek12 = new Rekening25("165112227763","Ai", "Haibara", "15644194285", "Proin.velit@Duisac.net");
        Rekening25 rek13 = new Rekening25("167206230943","Mouri", "Ran", "9776690", "ac@nibhAliquamornare.com");
        Rekening25 rek14 = new Rekening25("167711267372","Mouri", "Kogoro", "3535137", "cubilia.Curae.Phasellus@Duis.com");

        data.tambahRekening(rek1);
        data.tambahRekening(rek2);
        data.tambahRekening(rek3);
        data.tambahRekening(rek4);
        data.tambahRekening(rek5);
        data.tambahRekening(rek6);
        data.tambahRekening(rek7);
        data.tambahRekening(rek8);
        data.tambahRekening(rek9);
        data.tambahRekening(rek10);
        data.tambahRekening(rek11);
        data.tambahRekening(rek12);
        data.tambahRekening(rek13);
        data.tambahRekening(rek14);
    }
    public static void dataTransaksi(){
        Transaksi25 trans1 = new Transaksi25(898214, 494048, 3587, "Deposit", "2021-03-09 07:54:42");
        Transaksi25 trans2 = new Transaksi25(770592, 334245, 444267,"Deposit", "2020-08-11 13:36:56");
        Transaksi25 trans3 = new Transaksi25(685302, 451002, 376442, "Deposit", "2020-05-23 07:34:53");
        Transaksi25 trans4 = new Transaksi25(297103, 396116, 779589, "Deposit", "2021-07-03 01:09:49");
        Transaksi25 trans5 = new Transaksi25(66190, 259150, 619774, "Deposit", "2021-09-09 03:57:30");
        Transaksi25 trans6 = new Transaksi25(234301, 278309, 547922, "Deposit", "2021-08-24 13:18:39");
        Transaksi25 trans7 = new Transaksi25(243306, 869468, 50283, "Deposit", "2021-03-12 03:40:16");
        Transaksi25 trans8 = new Transaksi25(371045, 991242, 602034, "Deposit", "2021-08-06 11:48:59");
        Transaksi25 trans9 = new Transaksi25(395170, 97058, 472273, "Deposit" , "2021-05-02 10:53:31");
        Transaksi25 trans10 = new Transaksi25(862731, 561908, 109431,"Deposit", "2021-07-31 08:11:00");
        Transaksi25 trans11 = new Transaksi25(556798, 31387, 725426, "Deposit", "2021-03-27 06:18:20");
        Transaksi25 trans12 = new Transaksi25(873982, 896213, 846142, "Deposit", "2021-07-18 04:06:30");
        Transaksi25 trans13 = new Transaksi25(774247, 739406, 775848, "Deposit", "2020-10-24 01:39:00");
        Transaksi25 trans14 = new Transaksi25(66987, 823014, 868772, "Deposit", "2020-12-21 05:57:59");

        data.tambahTransaksi(trans1);
        data.tambahTransaksi(trans2);
        data.tambahTransaksi(trans3);
        data.tambahTransaksi(trans4);
        data.tambahTransaksi(trans5);
        data.tambahTransaksi(trans6);
        data.tambahTransaksi(trans7);
        data.tambahTransaksi(trans8);
        data.tambahTransaksi(trans9);
        data.tambahTransaksi(trans10);
        data.tambahTransaksi(trans11);
        data.tambahTransaksi(trans12);
        data.tambahTransaksi(trans13);
        data.tambahTransaksi(trans14);
    }
    public static void findNoRekening(){
        System.out.println("-----------------------------------");
        System.out.println("Pencarian berdasarkan no rekening");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan no rekening: ");
        userInput.nextLine();
        String norek = userInput.nextLine();
        data.check(norek);
    }
   public static boolean sortBy(){
        boolean cekBoolean = false;
        System.out.println("Pengurutan secara: ");
        System.out.println("1. Descending");
        System.out.println("2. Ascending");
        System.out.print("Masukkan nomor pilihan: ");
        int pilihan = userInput.nextInt();

        switch(pilihan){
            case 1:
                cekBoolean = true;
                break;
            case 2:
                cekBoolean = false;
                break;
            default:
                System.out.println("Pilihan tidak ditemukan");
                sortBy();
        }
        return cekBoolean;
    }
}