package StrukturDataStack;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Data Nama ");
        System.out.println("=====================================================");
        DataNama Dani = new DataNama("Dani", "Andani", 1);
        DataNama Azis = new DataNama("Azis", "Banon", 2);
        DataNama Abdul = new DataNama("Abdul", "Japar", 3);

        Linked stack = new Linked();
        stack.push(Dani);
        stack.push(Azis);
        stack.push(Abdul);

        stack.printStack();
        System.out.println("=====================================================");
        System.out.println("Data Pertama Sesudah Stack");
        System.out.println("=====================================================");
        System.out.println(stack.peek());

        stack.pop();

        System.out.println("=====================================================");
        System.out.println("Data Selanjutnya sesudah di stack");
        System.out.println("=====================================================");
        stack.printStack();

        //System.out.println(stack.size());
    }

}
