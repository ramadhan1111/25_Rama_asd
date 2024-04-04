package Minggu7;

public class PencarianMhs {
    //membuat objek array listMhs dan atribute idx
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    //Fungsi tambah untuk menambahkan objek 
    //dari class Mahasiswa ke dalam atribut listMhs
    //dan mengecek apakah data tidak atau lebih dari batas index array listMhs
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }



    //Fungsi tampil 
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("----------------------------------");
        }
    }

    //Fungsi FindSeqSearch
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j = 0; j < listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    //Tampil Tampilposisi
    void Tampilposisi(int x, int pos){
        if(pos != -1){
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);

        }else{
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    //Fungsi TampilData
    void TampilData(int x, int pos){
        if(pos != -1){
            System.out.println("NIM\t: " + x);
            System.out.println("Nama\t: " + listMhs[pos].nama);
            System.out.println("Umur\t: " + listMhs[pos].umur);
            System.out.println("IPK\t: " + listMhs[pos].ipk);
        }else{
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

  //Fungsi FindBinarySearch
  int FindBinarySearch(int cari, int left, int right){
    int mid;
    if(right >= left){
        mid = (left + right) / 2;
        if(cari == listMhs[mid].nim){
            return (mid);
        }else if(listMhs[mid].nim < cari){
            return FindBinarySearch(cari, left, mid - 1);
        }else{
            return FindBinarySearch(cari, mid + 1, right);
        }
    }
    return -1;
    }

}

