package lab62;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();
        long w = scan.nextLong();
        long h = scan.nextLong();

        Box box = new Box(n, w, h);
        System.out.println(box.findMinWall());
    }
}
