import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 7, 4, 809, 90};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum is the first element
            int minIndex = i;
            // Test against elements after i to find the smallest
            for (int j = i + 1; j < n; j++) {
                // If this element is less, then it is the new minimum
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }
}
