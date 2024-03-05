package Recursion;

public class MazeProblems {
    public static void main(String[] args) {
        //System.out.println(count(3,3));
        path("",3,3);
    }
    static int count(int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }
        int left = count(row-1, col);
        int right = count(row, col-1);

        return left+right;
    }

    //printing the maze path
    static void path(String p, int row, int col) {
        if(row == 1 && col ==1) {
            System.out.println(p);
            return;
        }
        if(row > 1) {
            path(p + 'D', row-1, col);
        }
        if(col > 1) {
            path(p + 'R', row, col-1);
        }
    }
}
