class removesortedarray {
    public int removesortedarray(List<Integer> arr) {
        int i = 0;
        int n = arr.size();
        for (int j = 1; j < n; j++) {
            if (!arr.get(j).equals(arr.get(i))) {
                i++;
                arr.set(i, arr.get(j));
            }
        }
        return i + 1;
    }
}

