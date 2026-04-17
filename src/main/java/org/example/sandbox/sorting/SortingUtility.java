package org.example.sandbox.sorting;



public class SortingUtility {
    public static<T extends Comparable<T>> void selectionSort(T[] data) {


        int min ;

        for (int index =0; index < data.length -1; index++){
            min = index;

            for (int scan = index +1; scan < data.length; scan++){

                if (data[scan].compareTo(data[min]) < 0){
                    min = scan;
                }
            }
            // swap min value with lowest index
            swap(data,min,index);
        }



    }

    private static<T extends Comparable <T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];

        data[index1] = data[index2];

        data[index2] = temp;
    }

    public static <T extends Comparable<T>> void insertionSort(T[] data) {

        for (int index = 1; index < data.length; index++) {
            T key = data[index];
            int position = index ;

            // shift larger values to the right

            while (position > 0 && data[position -1].compareTo(key)>0){
                data[position] = data[position -1];
                position --;
            }
            data[position] = key;
        }


    }
    
    public static <T extends Comparable<T>> void bubbleSort(T[] data) {
        
        int position, scan;
        for (position=data.length-1; position >= 0; position--) {
            for (scan =0; scan <= position-1; scan++) {

                if ( data[scan].compareTo(data[scan+1]) > 0) {
                    swap(data, position, scan+1);
                }

            }
        }
    }
}
