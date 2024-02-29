import java.util.Scanner;

public class MainDataUser {
    public static void main(String[] args) {
        // Mendapatkan data dari user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();

        System.out.print("Masukkan pekerjaan: ");
        String pekerjaan = scanner.nextLine();

        // Buat object User
        DataUser user = new DataUser(nama, usia, pekerjaan);

        // Buat array of objects
        DataUser[] users = new DataUser[1];
        users[0] = user;

        // Tampilkan data
        for (DataUser u : users) {
            System.out.println(u);
        }
    }
}
