import java.util.Scanner;

public class Pemilihan_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai tugas, kuis, UTS, dan UAS
        System.out.println("| Komponen | Nilai | Bobot |");
        System.out.println("|---|---|---|");
        System.out.print("| Tugas | ");
        int nilaiTugas = scanner.nextInt();
        System.out.print("| Kuis | ");
        int nilaiKuis = scanner.nextInt();
        System.out.print("| UTS | ");
        int nilaiUTS = scanner.nextInt();
        System.out.print("| UAS | ");
        int nilaiUAS = scanner.nextInt();

        // Validasi nilai
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        // Menghitung nilai akhir
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        // Konversi nilai akhir ke nilai huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 40) {
            nilaiHuruf = "C";
        } else {
            nilaiHuruf = "D";
        }

        // Menentukan keterangan LULUS/TIDAK LULUS
        String keterangan;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        // Output hasil
        System.out.println();
        System.out.println("| Hasil |");
        System.out.println("|---|---|");
        System.out.printf("| Nilai Akhir | %.2f |\n", nilaiAkhir);
        System.out.println("| Nilai Huruf | " + nilaiHuruf + " |");
        System.out.println("| Keterangan | " + keterangan + " |");
    }
}
