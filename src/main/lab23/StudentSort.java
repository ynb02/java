package lab23;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class StudentSort implements Sorting<Student> {
    private void quickSort(List<Student> students, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = students.get(left + (right - left) / 2).getAge();

        int i = left;
        int j = right;
        while (i<=j) {
            while (students.get(i).getAge() < pivot) {
                i++;
            }
            while (students.get(j).getAge() > pivot) {
                j--;
            }
            if (i <= j) {
                swap(students, i, j);

                i++;
                j--;
            }
        }

        quickSort(students, left, j);
        quickSort(students, i, right);
    }

    private void slice(List<Student> students, int start, int end) {
        if (start >= end) {
            return;
        }

        int middle = start + (end - start) / 2;
        slice(students, start, middle);
        slice(students, middle+1, end);

        merge(students, start, middle, end);
    }

    private void merge(List<Student> students, int start, int middle, int end) {
        List<Student> left = new ArrayList<>(students.subList(start, middle+1));
        List<Student> right = new ArrayList<>(students.subList(middle+1, end+1));

        int j = 0;
        int i = 0;
        int k = start;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getName().compareTo(right.get(j).getName()) <= 0) {
                students.set(k, left.get(i));
                i++;
            } else {
                students.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()) {
            students.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            students.set(k, right.get(j));
            j++;
            k++;
        }
    }

    @Override
    public void sort(List<Student> students) {
        quickSort(students, 0, students.size() - 1);
        slice(students, 0, students.size() - 1);
    }
}