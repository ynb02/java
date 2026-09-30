package lab02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(0,2,6,6,1,0,4,6));
        int val = 6;
        System.out.println(removeElementInplace(arr, val));
    }

    public static int removeElementInplace(List<Integer> arr, int val) {
        int j = 0;
        for (int i=0; i < arr.size(); i++) {
            if (arr.get(i) != val) {
                arr.set(j, arr.get(i));
                j++;
            }
        }
        return j;
    }
}
