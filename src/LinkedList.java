import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
class Mylinkedlist{
    Node head;
    void insert(int data){
        Node nn = new Node(data);
        if(head==null){
            head = nn;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = nn;
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    void middleEle(){
        Node fast = head;
        Node slow = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
    }
    void SkipEle(int target){
        Node temp = head;
        while(temp!=null){
            if(temp.val==target&&temp.next!=null){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        print();
    }
    boolean CycleDetect(){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Mylinkedlist obj = new Mylinkedlist();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.middleEle();
        obj.SkipEle(20);
        obj.print();
        System.out.println(obj.CycleDetect());
    }
}
