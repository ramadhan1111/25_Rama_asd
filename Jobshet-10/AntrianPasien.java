public class AntrianPasien {
    private static final int MAX_SIZE = 10;
    private Pasien[] queueArray;
    private int front;
    private int rear;
    private int size;

    public AntrianPasien() {
        queueArray = new Pasien[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public void enqueue(Pasien pasien) {
        if (!isFull()) {
            rear = (rear + 1) % MAX_SIZE;
            queueArray[rear] = pasien;
            size++;
        } else {
            System.out.println("Antrian sudah penuh");
        }
    }

    public Pasien dequeue() {
        if (!isEmpty()) {
            Pasien temp = queueArray[front];
            front = (front + 1) % MAX_SIZE;
            size--;
            return temp;
        } else {
            System.out.println("Antrian sudah kosong");
            return null;
        }
    }

    public Pasien peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Antrian sudah kosong");
            return null;
        }
    }

    public Pasien peekRear() {
        if (!isEmpty()) {
            return queueArray[rear];
        } else {
            System.out.println("Antrian sudah kosong");
            return null;
        }
    }

    public int peekPosition(String nama) {
        for (int i = front, count = 1; count <= size; i = (i + 1) % MAX_SIZE, count++) {
            if (queueArray[i].nama.equals(nama)) {
                return count;
            }
        }
        return -1; // Jika tidak ditemukan
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Antrian Pasien:");
            System.out.println("------------------------------------------------------------------");
            System.out.println(String.format("%-20s %-20s %-10s %-5s", "Nama", "Nomor Identitas", "Jenis Kelamin", "Umur"));
            System.out.println("------------------------------------------------------------------");
            for (int i = front, count = 0; count < size; i = (i + 1) % MAX_SIZE, count++) {
                System.out.println(queueArray[i]);
            }
            System.out.println("------------------------------------------------------------------");
        } else {
            System.out.println("Antrian sudah kosong");
        }
    }
}