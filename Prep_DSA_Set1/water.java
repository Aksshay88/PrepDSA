public class water {

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int res = 0;
        
        while (left < right) {
            int containerLength = right - left;
            int area = containerLength * Math.min(height[left], height[right]);
            res = Math.max(res, area);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] height = new int[] {1, 5, 4, 3};
        System.out.println(maxArea(height));
    }
}

