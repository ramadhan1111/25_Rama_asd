public class StackTugas1 {
    int size;
    int top;
    PakaianTugas1 data[];

    public StackTugas1(int size){
        this.size = size;
        data = new PakaianTugas1[size];
        top = -1;
    }
    public boolean isEmpty(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }
    public void push(PakaianTugas1 pkn1){
        if (!isFull()){
            top++;
            data[top] = pkn1;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }
    public void pop(){
        if (!isEmpty()){
            PakaianTugas1 x = data[top];
            top++;
            System.out.println("Data yang keluar: " + x.jenis + " "+ x.warna + " "+ x.merk + " " + x.ukuran + " " + x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen teratas: "+ data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }
    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i>0; i--){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println(" ");
    }
    public void clear(){
        if(!isEmpty()){
            for (int i = top; i>=0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    void getMin(){
        System.out.println(" ");
        if (!isEmpty());
        for (int i = top; i >= 0; i--){
            int idxMin = i;
        for (int j = i-1; j >= 0; j--){
            if (data[j].harga < data[idxMin].harga){
                idxMin = j;
            }
        }
        PakaianTugas1 tmp1 = data[idxMin];
        data[idxMin] = data[i];
        data[i] = tmp1;
        }
        System.out.println(data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }
}
