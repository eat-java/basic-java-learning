package chapter06;

public class Exercise6_20 {
    static int max(int[] arr) {
        int tmp = -999999;
        if (arr == null || arr.length == 0) {
            return tmp;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > tmp) {
                    tmp = arr[i];
                }
            }
            return tmp;
        }
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));

        System.out.println("최대값 " + max(data));
        System.out.println("최대값 " + max(null));
        System.out.println("최대값 " + max(new int[]{}));
    }
}
