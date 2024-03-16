import java.util.Scanner;
public class MainSum25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9) ");
        System.out.print("Masukkan Jumlah Bulan : ");
        int elm = sc25.nextInt();
        Sum25 sm = new Sum25(elm);
        System.out.println("===============================================================");
        for (int i = 0; i < sm.elemen; i++){
            System.out.print("Masukkan untung bulan ke - " + (i+1) + " = ");
            sm.keuntungan[i] = sc25.nextDouble();
        }
        System.out.println("===============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("===============================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
        System.out.println("===============================================================");
    }
}
