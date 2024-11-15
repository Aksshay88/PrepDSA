import java.util.*;

public class Maxproduct {

    public static int findmaxproductsubarray(int[] nums) {
        int start = 0, end = nums.length - 1;
        int productlefttoright = 1, productrighttoleft = 1;
        int currentproduct = Integer.MIN_VALUE, maxproduct = Integer.MIN_VALUE;

        while (start < nums.length && end >= 0) {
            if (productlefttoright == 0) {
                productlefttoright = nums[start];
                start++;
                continue;
            }
            if (productrighttoleft == 0) {
                productrighttoleft = nums[end];
                end--;
                continue;
            }

            productlefttoright *= nums[start];
            productrighttoleft *= nums[end];
            start++;
            end--;

            currentproduct = Math.max(productlefttoright, productrighttoleft);
            maxproduct = Math.max(maxproduct, currentproduct);
        }

        return maxproduct;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { -2, 6, -3, -10, 0, 2 };
        System.out.println(findmaxproductsubarray(nums));
    }
}

