import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[]={10,40,50,45};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    

    }
    static void sort(int[] a, int low, int high) {
       if(low>=high) return;
       int s=low;
       int e=high;
       int pi=s+e/2;
       int pivot=a[pi];
       while( s<=e){
        while(a[s]<pivot) s++;
        while(a[e]>pivot) e--;
        if(s<=e){
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
       }
       sort(a,low,e);
       sort(a,s,high);
   }

}
