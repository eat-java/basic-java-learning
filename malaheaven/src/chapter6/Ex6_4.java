package chapter6;

public class Ex6_4 {

    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt(Math.pow(getGreater(x, x1), 2) + Math.pow(getGreater(y, y1), 2));
    }

    static int getGreater(int n1, int n2) {
        return n1 > n2 ? n1 - n2 : n2 - n1;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
