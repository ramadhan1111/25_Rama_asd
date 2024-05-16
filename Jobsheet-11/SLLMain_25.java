public class SLLMain_25 {

    public static void main(String[] args) {

        LinkedList_25 myLinkedList_25 = new LinkedList_25();

        myLinkedList_25.Print();
        myLinkedList_25.AddFirst(800);
        myLinkedList_25.Print();
        myLinkedList_25.AddFirst(700);
        myLinkedList_25.Print();
        myLinkedList_25.AddLast(500);
        myLinkedList_25.Print();
        myLinkedList_25.InsertAfter(700, 300);
        myLinkedList_25.Print();

        // Percobaan 2

        System.out.println("\nData pada index ke-1             : " + myLinkedList_25.GetData(1));
        System.out.println("Data 300 berada pada index ke    : " + myLinkedList_25.IndexOf(300));
        System.out.println("");

        myLinkedList_25.Remove(300);
        myLinkedList_25.Print();
        myLinkedList_25.RemoveFirst();
        myLinkedList_25.Print();
        myLinkedList_25.RemoveLast();
        myLinkedList_25.Print();

        // Pertanyaan Percobaan 1 Nomor 4

        System.out.println("\nPertanyaan Percobaan 1 Nomor 4 (InsertAt)");

        myLinkedList_25.InsertAt(1,100);
        myLinkedList_25.Print();

        // Tugas Praktikum

        System.out.println("\nInsert Before");
        myLinkedList_25.InsertBefore(100, 250);
        myLinkedList_25.Print();

        System.out.println("\nInsert At");
        myLinkedList_25.InsertAt(2, 450);
        myLinkedList_25.Print();

        System.out.println("\nRemove At");
        myLinkedList_25.RemoveAt(3);
        myLinkedList_25.Print();

    }

}