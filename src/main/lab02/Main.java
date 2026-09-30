package lab02;

import java.util.LinkedList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeElementInplace(args[0], args[1]));
        List<Integer> test = new ArrayList
    }

    public static int removeElementInplace(List<Integer> arr, int val) {
        int j = 0;
        for (int i : arr) {
            if (arr[i] != val) {
                arr[j] = arr[i];
            }
        }
        return j;
    }
}
