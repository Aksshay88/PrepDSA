class Solution {
    int transitionPoint(int arr[]) {
        int n = arr.length;
        if (arr[0] == 1) return 0;
        int st = 0;
        int end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == 0) {
                st = mid + 1;
            } else {
                if (mid > 0 && arr[mid - 1] == 0) {
                    return mid;
                }
                end = mid - 1;
            }
        }
        return -1;
    }
}

