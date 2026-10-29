package lab81;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printer = new PrintWriter(new BufferedOutputStream(System.out));

        int n = Integer.parseInt(buf.readLine().trim());
        StringTokenizer splitBuf = new StringTokenizer(buf.readLine());

        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(splitBuf.nextToken());
        }

        PrefixSum sums = new PrefixSum(arrA);

        String line;
        while ((line = buf.readLine()) != null) {
            if (line.isBlank()) {
                continue;
            }
            splitBuf = new StringTokenizer(line);
            int from = Integer.parseInt(splitBuf.nextToken());
            int to = Integer.parseInt(splitBuf.nextToken());

            printer.println(sums.getSum(from, to));
        }

        printer.flush();
    }
}