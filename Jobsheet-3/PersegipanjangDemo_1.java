import java.util.Scanner;

public class PersegipanjangDemo_1 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        Persegipanjang_1[] arrayOfPersegipanjang = new Persegipanjang_1[3];
        int panjang, lebar;

        for (int i = 0; i < 3; i++){
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukan panjang: ");
            panjang = sc25.nextInt();
            System.out.print("Masukan lebar: ");
            lebar = sc25.nextInt();

            arrayOfPersegipanjang[i] = new Persegipanjang_1(panjang, lebar);
        }
        for (int i = 0; i < arrayOfPersegipanjang.length; i++){
            arrayOfPersegipanjang[i].CetakInfo();
            arrayOfPersegipanjang[i].hitungKeliling();
            arrayOfPersegipanjang[i].hitungLuas();
        }
    }
}
