import java.util.Scanner;
 class searching{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int target=sc.nextInt();
        System.out.println(BinarySearch(a, target));
    }
    static int BinarySearch(int a[],int target){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid=e+(s-e)/2;
             if(target>a[mid]){
                s=mid+1;
            }
            else if(target<a[mid]){
                e=mid-1;
            }
            else
            return mid;
        }
        return -1;
    }
}