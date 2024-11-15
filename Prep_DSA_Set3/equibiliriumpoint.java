class equilibriumpoint {
    public static int equilibriumPoint(int arr[]) {
        int n = arr.length;
        if (n == 1) {
            return n;
        }
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int left = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            if (totalSum == left) {
                return i + 1;
            }
            left += arr[i];
        }
        return -1;
    }
}

