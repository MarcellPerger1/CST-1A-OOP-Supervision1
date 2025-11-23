package uk.ac.cam.mp2226.part1a.oop.supo1;

import java.util.Arrays;

public class ValueRefDemo {
    private static void modifyItem(int[] a) {
        a[0] += 1;
        System.out.println("in modifyItem: " + Arrays.toString(a));
    }

    private static void reassignArray(int[] a) {
        a = new int[]{1, 2};
        System.out.println("in reassignArray: " + Arrays.toString(a));
    }



    public static void main(String[] args) {
        {
            int[] a = {0, 2};
            modifyItem(a);
            System.out.println("after modifyItem: " + Arrays.toString(a));
        }
        {
            int[] a = {0, 2};
            reassignArray(a);
            System.out.println("after reassignArray: " + Arrays.toString(a));
        }
        // Output:
        //  in modifyItem: [1, 2]
        //  after modifyItem: [1, 2]
        //  in reassignArray: [1, 2]
        //  after reassignArray: [0, 2]
        // Line 1-2: reference copied so changing items propagates out
        // Line 3-4: reference copied so reassigning doesn't propagate out
    }
}
