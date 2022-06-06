package chapter6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ex6_17 {

    public static int[] shuffle(int[] original) {
        for (int i = 0; i < original.length; i++) {
            int j = (int) (Math.random() * original.length);

            int temp = original[i];
            original[i] = original[j];
            original[j] = temp;
        }

        return original;
    }


    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }

}
