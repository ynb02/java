package lab31;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        int n = scan.nextInt();
        for (int i=0; i<n; i++) {
            nums.add(scan.nextInt());
        }

        Sorting<Integer> SORT = new CountingSort();
        SORT.sort(nums);

        System.out.println(nums.stream()
                .map(x -> String.valueOf(x))
                .collect(Collectors.joining(" ")));
    }
}

