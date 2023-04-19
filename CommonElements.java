import java.util.Arrays;
public class CommonElements {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {3, 4, 5, 6, 7};
            int[] commonElements = new int[Math.min(array1.length, array2.length)];
            int index = 0;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        commonElements[index] = array1[i];
                        index++;
                        break;
                    }
                }
            }
            System.out.println("The common elements between the two arrays are: " + Arrays.toString(Arrays.copyOf(commonElements, index)));
        }
    }


