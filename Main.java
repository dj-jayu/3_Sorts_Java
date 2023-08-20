import java.util.Arrays;
import java.util.Comparator;

class myComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {3,2,1};
        System.out.println(Arrays.toString(arr));
        Sorting.insertionSort(arr, new myComparator());
        System.out.println(Arrays.toString(arr));
    }
}
