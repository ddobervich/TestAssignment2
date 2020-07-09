public class SelectionSort implements Sorter {

    public int[] sort(int[] arr) {
        for (int startLoc = 0; startLoc < arr.length; startLoc++) {
            int minIndex = findIndexOfMinStartingAt(startLoc, arr);
            swap(startLoc, minIndex, arr);
        }

        return arr;
    }

    @Override
    public String getName() {
        return "Selection sort";
    }

    private void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int findIndexOfMinStartingAt(int startingIndex, int[] arr) {
        int minVal = arr[startingIndex];
        int minIndex = startingIndex;

        for (int i = startingIndex+1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minIndex = i;
                minVal = arr[i];
            }
        }

        return minIndex;
    }
}
