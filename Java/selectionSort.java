package daa_assignment;

import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String args[]) {
    int[] arr = { 55,61,18,2,7,5,12};
    SelectionSort sort = new SelectionSort();
    sort.selectionSort(arr);
    
    System.out.println("Sorted Array in Decending Order: " +Arrays.toString(arr));
  }
    
    void selectionSort(int array[]) {
    int size = array.length;

    for (int step = 0; step < size - 1; step++) {
      int min = step;

      for (int i = step + 1; i < size; i++) {
        if (array[i] < array[min]) {
          min = i;
        }
      }  
      int temp = array[step];
      array[step] = array[min];
      array[min] = temp;
    }
  }
}
