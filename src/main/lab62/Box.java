package lab62;

public class Box {
    private final long n;
    private final long w;
    private final long h;

    public Box(long n, long w, long h) {
        this.n = n;
        this.w = w;
        this.h = h;
    }

    private boolean isFit(long side) {
        long diplomsInRow = side / w;
        long colums = side / h;
        if (diplomsInRow == 0 || colums == 0) {
            return false;
        }

        long rowsNeeded = (n + diplomsInRow - 1) / diplomsInRow;

        boolean result = colums >= rowsNeeded;
        return result;
    }

    public long findMinWall() {
        long left = 0;
        long right = Math.max(w, h) * n;
        while (right - left > 1) {
            long middle = left + (right - left) / 2;
            if (isFit(middle)) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return right;
    }
}
