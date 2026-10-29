package lab61;

public class SearchNum {
    private final int[] nums;

    public SearchNum(int[] arrA) { nums = arrA; }

    private int findPos(int query) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] < query) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }

    public int findNear(int query) {
        int position = findPos(query);
        if (position == 0) {
            return nums[0];
        }
        if (position == nums.length) {
            return nums[nums.length - 1];
        }

        long distanceLeft = (long)query - nums[position - 1];
        long distanceRight = (long)nums[position] - query;
        if (distanceLeft <= distanceRight) {
            return nums[position - 1];
        }
        return nums[position];
    }
}
