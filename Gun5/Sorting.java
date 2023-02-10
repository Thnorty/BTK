public class Sorting {
    public static void main(String[] args) {
        //Insertion sort
        int[] array = {5, 2, 4, 1, 10};
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Selection sort
        int[] array2 = {5, 2, 4, 1, 10};
        for (int i = 0; i < array2.length; i++) {
            int min = array2[i];
            int minIndex = i;
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[j] < min) {
                    min = array2[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                array2[minIndex] = array2[i];
                array2[i] = min;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
