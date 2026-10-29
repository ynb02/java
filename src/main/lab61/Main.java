package lab61;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        SearchNum search = new SearchNum(nums);

        int m = scan.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (i > 0) {
                result.append(' ');
            }
            result.append(search.findNear(scan.nextInt()));
        }

        System.out.println(result);
    }
}
