package lab31;

import java.util.List;

public class CountingSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums) {
        int[] count = new int[128];
        for (int x : nums) {
            count[x]++;
        }

        int pos = 0;
        for(int i=0; i<=count.length; i++) {
            for(int j=0; j<count[i]; j++) {
                nums.set(pos, i);
                pos++;
            }
        }

    }
}