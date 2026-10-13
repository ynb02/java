package lab21;

import java.util.List;
import java.util.stream.Collectors;

public class InsertionSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums) {
        for (int i=0; i<nums.size(); i++) {
            for (int j=0; j<nums.size()-1; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    int temp = nums.get(j + 1);

                    nums.set(j+1, nums.get(j));
                    nums.set(j, temp);
                }
            }
        }
        System.out.println(nums.stream()
                .map(x->String.valueOf(x))
                .collect(Collectors.joining(" ")));
    }
}