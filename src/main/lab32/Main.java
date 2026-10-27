package lab32;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<BigInteger> nums = new ArrayList<>();

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            nums.add(scan.nextBigInteger());
        }

        Sorting<BigInteger> SORT = new RadixSort();
        SORT.sort(nums);

        System.out.println(nums.stream()
                .map(x -> String.valueOf(x))
                .collect(Collectors.joining("\n")));
    }
}