package es.iesmz.tests;

public class Vector {


    public static int[] reverso(int[] v) {
        int start = 0;
        int end = v.length - 1;
        while (start < end) {
            int temp = v[start];
            v[start] = v[end];
            v[end] = temp;
            start++;
            end--;
        }
        return v;
    }

}
