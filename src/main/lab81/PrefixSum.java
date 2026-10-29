package lab81;

public class PrefixSum {
    private final int[] prefix;

    public PrefixSum(int[] numbers) {
        prefix = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            prefix[i + 1] = prefix[i] + numbers[i];
        }
    }

    public long getSum(int from, int to) {
        return prefix[to + 1] - prefix[from];
    }
}
