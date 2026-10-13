package lab21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        int n = scan.nextInt();
        for (int i = 0; i<n; i++) {
            nums.add(scan.nextInt());
        }

        Sorting<Integer> SORT = new InsertionSort();
        SORT.sort(nums);
    }
}