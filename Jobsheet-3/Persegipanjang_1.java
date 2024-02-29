public class Persegipanjang_1 {
    public int panjang;
    public int lebar;

    public Persegipanjang_1(int p, int l){
        panjang = p;
        lebar = l;
    }
    void CetakInfo(){
        for (int i = 0; i < 3; i++){
            System.out.println("Persegi panjang ke-" + (i + 1) + ",panjang: " + panjang + ", lebar: " + lebar);
        }
    }
    void hitungKeliling(){
        int keliling = 2 *(panjang + lebar);
        System.out.println("Keliling: "+ keliling);
    }
    void hitungLuas(){
        int Luas = panjang*lebar;
        System.out.println("Luas : "+ Luas);
    }
}
