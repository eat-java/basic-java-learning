package chapter6;

import java.util.Arrays;

public class Ex6_20 {


    private static int max(int[] data) {
        return data == null ? -999999 : Arrays.stream(data).max().orElse(-999999);
    }


    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));

        System.out.println("최대값 " + max(data));
        System.out.println("최대값 " + max(null));
        System.out.println("최대값 " + max(new int[]{}));
    }
}
