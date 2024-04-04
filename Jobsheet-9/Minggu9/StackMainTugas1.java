import java.util.Scanner;
public class StackMainTugas1 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        StackTugas1 stk1 = new StackTugas1(5);
        char pilih;
        do{
            System.out.println("Jenis: ");
            String jenis = sc25.nextLine();
            System.out.println("Warna: ");
            String warna = sc25.nextLine();
            System.out.println("Merk: ");
            String merk = sc25.nextLine();
            System.out.println("Ukuran: ");
            String ukuran = sc25.nextLine();
            System.out.println("Harga: ");
            double harga = sc25.nextDouble();

            PakaianTugas1 p = new PakaianTugas1(jenis, warna, merk, ukuran, harga);
            System.out.println("Apakah Anda akan menambahkan data baru ke stack (y / n): ");
            pilih = sc25.next().charAt(0);
            sc25.nextLine();
            stk1.push(p);
        }while (pilih == 'y');
        stk1.print();
        System.out.println("-------------------------------------");
        System.out.println("Data berdasarkan Harga terendah: ");
        stk1.getMin();
        System.out.println("-------------------------------------");
        stk1.pop();
        stk1.peek();
        stk1.print();
    }
}
