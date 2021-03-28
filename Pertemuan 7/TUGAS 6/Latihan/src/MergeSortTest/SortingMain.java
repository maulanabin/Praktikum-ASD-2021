package MergeSortTest;

public class SortingMain {
    public static void main(String[] args) {
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("SORTING DENGAN MERGE SORT");
        MergeSorting mSort = new MergeSorting();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(data);
    }
}
