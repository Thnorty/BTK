import java.util.ArrayList;

public class Arrays {
    // private static int elemanSayisi = 0;
    public static void main(String[] args) {
        //Yontem1
        int[] array1 = new int[5];

        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;

        //Yontem2
        String[] array2;
        array2 = new String[10];
        array2[0] = "";

        System.out.println("Array1'in sifinci elemani: " + array1[0]);
        System.out.println("Array1'in birinci elemani: " + array1[1]);

        //Yontem3
        int[] array3 = {5, 6, 7, 8, 9, 10};
        System.out.println("Array3'un birinci elemani: " + array3[1]);

        for (int i = 0; i < array3.length; i++) {
            if (i == array3.length-1) {
                System.out.print(array3[i]);
            } else {
                System.out.print(array3[i] + ", ");
            }
        }
        System.out.println();

        double[] array4 = {5, 2, 1, 10, 15, -5.2, -100.91};
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array4.length; i++) {
            if (max < array4[i]) {
                max = array4[i];
            }
        }
        System.out.println("Max elemani: " + max);

        float[] array5 = {-10.2f, -25f, -10f, -56.1f};
        float min = Float.MAX_VALUE;
        for (int i = 0; i < array5.length; i++) {
            if (min > array5[i])
                min = array5[i];
        }
        System.out.println("Min elemani: " + min);

        int[] array6 = {10, 2, -5, -109, -256, 5246236};
        int sum = 0;

        //for-each
        for (int i : array6) {
            sum += i;
        }

        double mean = (double)sum/array6.length;
        System.out.println("Ortalamasi: " + mean);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.print("ArrayList icindekiler: ");
        for(int i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("ArrayList icindekiler (normal for): ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        if (arrayList.contains(0)) {
            System.out.println("ArrayList icinde 0 var!!!");
        }
        arrayList.remove(0);
        if (arrayList.contains(0)) {
            System.out.println("ArrayList icinde 0 var!!!");
        }

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("hello");
        arrayList2.add("hell");
        arrayList2.add("hel");
        arrayList2.add("he");
        arrayList2.add("h");
        arrayList2.remove("hell");

        arrayList2.set(1, "degisti");
        
        ArrayList<Double> arrayList3 = new ArrayList<Double>();
        arrayList3.add(2.1);
        arrayList3.add(0.1);
        arrayList3.add(-10.2);
        arrayList3.add(50.2);
        System.out.println("ArrayList3 eski: ");
        for (double i : arrayList3) {
            System.out.print(i + " ");
        }
        System.out.println();
        arrayList3.sort(null);
        System.out.println("ArrayList3 yeni: ");
        for (double i : arrayList3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(arrayList3);
        System.out.println(arrayList3.toString());

        Object[] arrayList3Arrayi = arrayList3.toArray();

        for (int i = 0; i < arrayList3Arrayi.length; i++) {
            System.out.print(arrayList3Arrayi[i] + " ");
        }
        System.out.println();

        // int[] array7 = new int[4];
        // array7 = arraySizeCheck(array7);
        // array7[0] = 0;
        // elemanSayisi++;
        // array7 = arraySizeCheck(array7);
        // array7[1] = 1;
        // elemanSayisi++;
        // array7 = arraySizeCheck(array7);
        // array7[2] = 2;
        // elemanSayisi++;
        // array7 = arraySizeCheck(array7);
        // array7[3] = 3;
        // elemanSayisi++;
        // array7 = arraySizeCheck(array7);
        // array7[4] = 4;
        // elemanSayisi++;
        // array7 = arraySizeCheck(array7);

    }

    // public static int[] arraySizeCheck(int[] array) {
    //     if (elemanSayisi == array.length-2) {
    //         int[] newArray = new int[array.length*2];
    //         for (int i = 0; i < array.length; i++) {
    //             newArray[i] = array[i];
    //         }
    //         for (int i = 0; i < newArray.length; i++) {
    //             System.out.println(newArray[i]);
    //         }
    //         return newArray;
    //     }
    //     else {
    //         return array;
    //     }
    // }
}