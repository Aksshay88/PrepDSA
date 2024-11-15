import java.util.Arrays;

public class chocolate {

    public static int findMinDifference(int[] arr, int m) {
        int n = arr.length;
        if (n < m) {
            return -1;
        }
        
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i <= n - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 2, 4, 9, 12, 56};
        int m1 = 3;
        System.out.println(findMinDifference(arr1, m1));
        
        int[] arr2 = {7, 3, 2, 4, 9, 12, 56};
        int m2 = 5;
        System.out.println(findMinDifference(arr2, m2));
    }
}

