package lab22;

import java.util.List;
import java.util.stream.Collectors;

public class MergeSort implements Sorting<Integer> {
    private void slice(List<Integer> nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int middle = start + (end - start) / 2;
        slice(nums, start, middle);
        slice(nums, middle+1, end);

        merge(nums, start, middle, end);
    }

    private void merge(List<Integer> nums, int start, int middle, int end) {
        List<Integer>
    }

    @Override
    public void sort(List<Integer> nums) {
        slice(nums, 0, nums.size() - 1);
        System.out.println(nums.stream()
                .map(x->String.valueOf(x))
                .collect(Collectors.joining(" ")));
    }
}