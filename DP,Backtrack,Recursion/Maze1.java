package BackTrack;

public class Maze1 {
    public static void main(String[] args) {
        // System.out.println(countways(3,4));
        printPath("", 3, 4);
    }
    static int countways(int r,int c){
        if(r==1||c==1) return 1;
        int left=countways(r-1, c);
        int right=countways(r, c-1);
        return left+right;
    }
    static void printPath(String p,int r,int c){
        if(r==1 && c==1) {
            System.out.println(p);
            return;
        }
        if(r>1){
            printPath(p+'D', r-1, c);
        }
        if(c>1)
        printPath(p+'R', r, c-1);
    }

}
