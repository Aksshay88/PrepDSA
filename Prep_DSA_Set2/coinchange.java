class coinchange {
    public int count(int coins[], int sum) {
        int N = coins.length;
        int table[] = new int[sum + 1];
        for (int i = 0; i < sum + 1; i++) table[i] = 0;
        table[0] = 1;
        for (int i = 0; i < N; i++)
            for (int j = coins[i]; j <= sum; j++)
                table[j] += table[j - coins[i]];
        return table[sum];
    }
}

