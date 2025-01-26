package NewCode;


 class GenericMethodContainer {
    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
public class Generics {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};

        // Calling the generic method from GenericMethodContainer
        GenericMethodContainer.printArray(intArray); // Output: 1 2 3 4 5
        GenericMethodContainer.printArray(strArray); // Output: A B C
    }
}

