import java.util.Scanner;

public class BinarySearchusingRecur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(search(target,a,0,n-1));
    }

    private static int search(int target, int[] a, int s, int e) {
        if(e<s) return -1;
        int mid=(s+e)/2;
        if(a[mid]==target) return target;
        if(a[mid]<target) return search(target, a, mid+1, e);
        return search(target, a, s, mid-1);

    }
}
