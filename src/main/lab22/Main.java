package lab22;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        int n = scan.nextInt();
        for (int i=0; i<n; i++) {
            nums.add(scan.nextInt());
        }

        Sorting<Integer> SORT = new MergeSort();
        SORT.sort(nums);
    }
}
