package StrukturDataStack;
import java.util.EmptyStackException;

public class Array {
    private DataNama[] stack;
    private  int top;

    public Array(int capacity){
        stack = new DataNama[capacity];
    }
    public void push (DataNama dataNama){
        if (top == stack.length){
            DataNama[] newArray = new DataNama[2 * stack.length];
            System.arraycopy(stack,0, newArray, 0,stack.length);
            stack = newArray;
        }
        stack[top++] = dataNama;
    }
    public DataNama pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        DataNama dataNama = stack[--top];
        stack[top] = null;
        return dataNama;
    }
    public DataNama peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public int size() {
        return top;
    }
    public void printStack(){
        for (int i = top-1; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
}
