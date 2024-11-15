import java.util.ArrayList;

class firstandlastoccurence {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> result = new ArrayList<>();
        int firstOccurrence = findFirst(arr, x);
        int lastOccurrence = findLast(arr, x);
        result.add(firstOccurrence);
        result.add(lastOccurrence);
        return result;
    }

    int findFirst(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int firstOccurrence = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                firstOccurrence = mid;
                end = mid - 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return firstOccurrence;
    }

    int findLast(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int lastOccurrence = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                lastOccurrence = mid;
                start = mid + 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastOccurrence;
    }
}

