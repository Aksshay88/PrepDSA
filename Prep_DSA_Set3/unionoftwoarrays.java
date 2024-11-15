class unionoftwoarrays {
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set1.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set1.add(b[i]);
        }
        int result = set1.size();
        return result;
    }
}

