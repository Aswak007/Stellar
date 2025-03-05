package STACK;
import java.util.*;
class mystack{
    ArrayList<Integer> list;
    int ti=-1;
    public mystack(){
        list = new ArrayList<>();
        ti=-1;
    }
public void push(int x) {
    list.add(x);
    ti++;
}
public int pop() {
    int a = list.get(ti);
    list.remove(ti);
    ti--;
    return a;
}
public int peek(){
    int a = list.get(ti);
    return a;
}
public boolean isEmpty(){
        return ti==-1;
}
public int size(){
        return ti+1;
}
}

public class stackusingArray {
    public static void main(String[] args) {
        {
            mystack st= new mystack();
            st.push(10);
            System.out.println(st.pop());
            System.out.println(st.isEmpty());
            System.out.println(st.size());
            st.push(25);
            st.push(52);
            st.push(55);
            System.out.println(st.pop());
            st.push(42);
            System.out.println(st.isEmpty());
            st.push(24);
            System.out.println(st.peek());
        }
    }
}
