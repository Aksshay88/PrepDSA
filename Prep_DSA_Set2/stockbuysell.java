import java.util.ArrayList;
class stockbuysell {
    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int i = 0;
        while (i < n - 1) {
            while (i < n - 1 && A[i] >= A[i + 1]) {
                i++;
            }
            if (i == n - 1) break; 

            int buy = i++;

            while (i < n && A[i] > A[i - 1]) {
                i++;
            }
            int sell = i - 1;
            ArrayList<Integer> res = new ArrayList<>();
            res.add(buy);
            res.add(sell);
            list.add(res);
        }

        return list;
    }
}

