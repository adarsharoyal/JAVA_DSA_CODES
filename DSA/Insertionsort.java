package DSA;

public class Insertionsort {
    public static void main(String[] args) {
         int array[] = {3, 2, 5, 1, 4};
         int size = array.length;
          for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
              array[j + 1] = array[j];
              j--;
            }
            array[j + 1] = key;
            System.out.print(" process of sorting  : ");
            for (int num : array) {
              System.out.print(num + " ");
            }
            System.out.println();
          }
          for (int num : array) {
            System.out.print(num + " ");
          }
    }
}
