
import java.util.Arrays;
public class RemoveElement {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int elementToRemove = 3;
            int[] newArray = new int[array.length - 1];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != elementToRemove) {
                    newArray[index] = array[i];
                    index++;
                }
            }
            System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArray));
        }
    }


