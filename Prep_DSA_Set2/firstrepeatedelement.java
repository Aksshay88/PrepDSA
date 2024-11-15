import java.util.HashSet;
public class firstrepeatedelement{
    public static int firstRepeated(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int firstRepeatedIndex = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                firstRepeatedIndex = i + 1;
            } else {
                set.add(arr[i]);
            }
        }

        return firstRepeatedIndex;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int result = firstRepeated(arr);
        System.out.println("The 1-based index of the first repeated element is: " + result);
    }
}

