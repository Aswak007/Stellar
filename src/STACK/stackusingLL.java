package STACK;
import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
static class LL {
    private Node head;

    public LL() {
        head = null;
    }
    public void push(int x) {
        Node s = new Node(x);
        if (s == null) {
            System.out.println("overflow error");
            return;
        }
        s.next = head;
        head = s;
    }
    public int pop() {
       if(head==null){
           System.out.println("underflow error");
       }
        return -1;
    }
    public int peek(){
        if(head==null) {
            System.out.println("cant find element");
        }
        int ele =head.data;
        return ele;
    }
    public Node isEmpty(){
        return head=null;
    }
    public int size(){
        Node t=head;int c=0;
        while(t!=null){
            t=t.next;
            c++;
        }
        return c;
    }
}

public class stackusingLL {
    public static void main(String[] args) {
        LL st =new LL();
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

