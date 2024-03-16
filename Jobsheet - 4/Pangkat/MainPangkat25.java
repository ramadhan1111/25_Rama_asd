package Pangkat;
import java.util.Scanner;
public class MainPangkat25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        System.out.println("================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc25.nextInt();
        Pangkat25[] png = new Pangkat25[elemen];
        for (int i = 0; i < elemen; i++){
            png[i] = new Pangkat25();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai = sc25.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            png[i].pangkat = sc25.nextInt();
        }
        System.out.println("================================================");
        System.out.println("Hasil Pangkat dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " +png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("================================================");
        System.out.println("Hasil Pangkat dengan Divide Conquer");
        for (int i = 0; i < elemen; i++){
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " +png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
    }
}
