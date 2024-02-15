import java.util.Scanner;

public class Perulangan_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM Anda: ");
        int nim = scanner.nextInt();

        // Mendapatkan 2-digit terakhir NIM
        int n = nim % 100;

        // Jika n kurang dari 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        // Menampilkan deretan bilangan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            System.out.print(i % 2 == 0 ? i + " " : "* ");
        }

        System.out.println();
    }
}
