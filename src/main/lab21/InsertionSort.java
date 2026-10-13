package lab21;

import java.util.List;
import java.util.stream.Collectors;

public class InsertionSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            int el = nums.get(i);
            int j;
            for (j = i - 1; j >= 0 && nums.get(j) > el; j--) {
                nums.set(j + 1, nums.get(j));
            }
        }
        System.out.println(nums.stream()
                .map(x -> String.valueOf(x))
                .collect(Collectors.joining(" ")));
    }
}