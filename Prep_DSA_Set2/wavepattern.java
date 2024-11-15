class wavepattern {
    public static void convertToWave(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i = i + 2) {
            swap(arr, i, i + 1);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        convertToWave(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

