import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    public static final int[] reverse = {6, 5, 4, 3, 2, 1};
    public static final int[] inOrder = {1, 2, 3, 4, 5, 6};
    public static final int[] repeatedVals = {6, 6, 5, 3, 3, 3, 3, 3, 10, 10, 10, 1, 1, 4, 4};
    public static final int[] short1 = {1};
    public static final int[] short2 = {99999, 3};

    public static final int[] reverseSolution = {1, 2, 3, 4, 5, 6};
    public static final int[] inOrderSolution = {1, 2, 3, 4, 5, 6};
    public static final int[] repeatedValsSolution = {1, 1, 3, 3, 3, 3, 3, 4, 4, 5, 6, 6};
    public static final int[] short1Solution = {1};
    public static final int[] short2Solution = {3, 99999};

    public static ArrayList<Sorter> sorts = new ArrayList<>();
    public static ArrayList<int[]> tests = new ArrayList<>();

    public static void main(String[] args) {
        sorts.add( new SelectionSort() );

        for (Sorter sort : sorts) {
            runAllTestsOn(sort);
        }
    }

    private static void runAllTestsOn(Sorter sort) {

    }
}