import java.util.*;
class MyQueue{
    Stack<Integer> Input;
    Stack<Integer> Output;
    MyQueue(){
        Input = new Stack<>();
        Output = new Stack<>();
    }
    public void push(int x){
        Input.push(x);
    }
    public int pop(){
        peek();
        return Output.pop();
    }
    public int peek(){
        if(Output.isEmpty()) {
            while(!Input.isEmpty()) {
                Output.push(Input.pop());
            }
        }
        return Output.peek();
    }
    public boolean isEmpty(){
        return Input.isEmpty()&&Output.isEmpty();
    }
    public void display(){
        while(!Input.isEmpty()){
            Output.push(Input.pop());
        }
        System.out.println(Output);
    }
}
public class Main{
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.pop();
        obj.display();
    }
}