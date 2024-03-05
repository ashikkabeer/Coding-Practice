package Maths;
public class Main {
    public static void main(String[] args) {
        int res = BitAND(10);
        System.out.println(res);
    }
    public static int BitAND(int n) {
        //multiply by 2
        return n ^ 6;
    }

    /*              AND     OR      XOR     NOT
    * X     Y       X&Y     X|Y     X^Y     ~(X)
    * 0     0       0       0       0       1
    * 0     1       0       1       1       1
    * 1     0       0       1       1       0
    * 1     1       1       1       0       0
    */
}
