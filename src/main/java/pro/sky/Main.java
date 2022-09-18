package pro.sky;

import pro.sky.services.IntegerList;
import pro.sky.services.IntegerListImpl;

public class Main {
    public static void main(String[] args) {
        IntegerList integerList = new IntegerListImpl();
        Integer[] arr = generateRandomArray();
        Integer[] arr1 = arr;
        Integer[] arr2 = arr;
        Integer[] arr3 = arr;

        long start = System.currentTimeMillis();
        integerList.swapSort(arr1);
        long check1 = System.currentTimeMillis() - start;
        System.out.println("Время, потребовавшееся для swapSort = " + check1 + " мс");
        long check2 = System.currentTimeMillis() - start - check1;
        integerList.selectionSort(arr2);
        System.out.println("Время, потребовавшееся для selectionSort = " + check2 + " мс");
        long check3 = System.currentTimeMillis() - start - check2;
        integerList.insertionSort(arr3);
        System.out.println("Время, потребовавшееся для selectionSort = " + check3 + " мс");
        integerList.add(100080);
        System.out.println(integerList.contains(100080));
    }


    public static Integer[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        Integer[] arr = new Integer[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}