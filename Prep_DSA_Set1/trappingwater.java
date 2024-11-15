public class trappingwater {
    public static int trap(int[] h) {
        if (h == null || h.length == 0) {
            return 0;
        }
        int l = 0, r = h.length - 1;
        int lm = 0, rm = 0;
        int w = 0;
        while (l <= r) {
            if (h[l] <= h[r]) {
                if (h[l] >= lm) {
                    lm = h[l];
                } else {
                    w += lm - h[l];
                }
                l++;
            } else {
                if (h[r] >= rm) {
                    rm = h[r];
                } else {
                    w += rm - h[r];
                }
                r--;
            }
        }
        return w;
    }
    public static void main(String[] args) {
        int[] a1 = {3, 0, 1, 0, 4, 0, 2};
        int[] a2 = {3, 0, 2, 0, 4};
        System.out.println(trap(a1));
        System.out.println(trap(a2));
    }
}
