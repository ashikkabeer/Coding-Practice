package StackQueueQuestions;

import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(7);
        s.add(6);
        s.add(3);
        s.add(0);
        s.add(2);

        sortStack(s);

        while(!s.isEmpty()) {
            System.out.print(" "+s.pop());
        }
    }

    public static void sortStack(Stack<Integer> s) {
        Stack<Integer> r = new Stack<>();
        while(!s.isEmpty()) {
            int tmp = s.pop();
            while (!r.isEmpty() && r.peek() > tmp) {
                s.push(r.pop());
            }
            r.push(tmp);
        }
        while(!r.isEmpty()) {
            s.push(r.pop());
        }
    }

}
