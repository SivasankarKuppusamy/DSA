import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[]={1,5,3,5,7,0,9};
        a=sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static int[] sort(int[] a) {
        int n=a.length;
        if(n==1) return a;
        int mid=n/2;
        int first[]=sort(Arrays.copyOfRange(a, 0, mid));
        int second[]=sort(Arrays.copyOfRange(a, mid, n));
        return merge(first,second);
    }

    private static int[] merge(int[] first, int[] second) {
        int i=0;
        int j=0;
        int k=0;
        int c[]=new int[first.length+second.length];
        while(i<first.length&&j<second.length){
            if(first[i]<second[j]){
                c[k]=first[i];
                i++;
            }
            else{
                c[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            c[k++]=first[i++];
        }
        while(j<second.length){
            c[k++]=second[j++];
        }
        return c;

    }
    

}
