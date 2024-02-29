public class PersegipanjangDemo {
    public static void main(String[] args) {
        Persegipanjang[] arrayOfPersegipanjang = new Persegipanjang[3];

        arrayOfPersegipanjang[0] = new Persegipanjang();
        arrayOfPersegipanjang[0].panjang = 110;
        arrayOfPersegipanjang[0].lebar = 30;

        arrayOfPersegipanjang[1] = new Persegipanjang();
        arrayOfPersegipanjang[1].panjang = 80;
        arrayOfPersegipanjang[1].lebar = 40;

        arrayOfPersegipanjang[2] = new Persegipanjang();
        arrayOfPersegipanjang[2].panjang = 100;
        arrayOfPersegipanjang[2].lebar = 20;

        System.out.println("Persegi panjang ke-1,panjang: " + arrayOfPersegipanjang[0].panjang + ", lebar: "+ arrayOfPersegipanjang[0].lebar);
        System.out.println("Persegi panjang ke-2,panjang: " + arrayOfPersegipanjang[1].panjang + ", lebar: "+ arrayOfPersegipanjang[1].lebar);
        System.out.println("Persegi panjang ke-3,panjang: " + arrayOfPersegipanjang[2].panjang + ", lebar: "+ arrayOfPersegipanjang[2].lebar);
    }
}
