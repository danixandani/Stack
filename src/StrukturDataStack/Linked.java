package StrukturDataStack;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {
    private LinkedList<DataNama> stack;

    public Linked(){
        stack = new LinkedList<DataNama>();
    }
    public void push (DataNama dataNama){
        stack.push(dataNama);
    }
    public DataNama pop(){
        return stack.pop();
    }
    public DataNama peek(){
        return stack.peek();
    }
    public Boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size(){
        return stack.size();
    }
    public void printStack(){
        ListIterator<DataNama> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
