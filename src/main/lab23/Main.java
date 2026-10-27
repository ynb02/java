package lab23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String name = scan.next();
            int age = scan.nextInt();

            Student x = new Student(name, age);

            students.add(x);
        }

        Sorting<Student> SORT = new StudentSort();
        SORT.sort(students);

        for (int j=0; j<n; j++) {
            Student x = students.get(j);
            System.out.println(x.getName() + " " + x.getAge());
        }
    }
}