import java.util.Scanner;

public class permutaion_of_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        permutation("",s);
    }

    private static void permutation(String p, String up) {
        if(up.length()==0) {
            System.out.println(p);
            return;
        } 
        char c=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String s1=p.substring(0, i);
            String s2=p.substring(i,p.length());
            permutation(s1+c+s2, up.substring(1));
        }
    }
}
