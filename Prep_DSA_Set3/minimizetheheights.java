class minimizetheheights {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int tempmin, tempmax;
        tempmin = arr[0];
        tempmax = arr[n - 1];
        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0)
                continue;
            tempmin = Math.min(arr[0] + k, arr[i] - k);
            tempmax = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            ans = Math.min(ans, tempmax - tempmin);
        }
        return ans;
    }
}

