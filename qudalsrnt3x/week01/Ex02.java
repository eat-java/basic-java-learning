package week01;

public class Ex02 {

    // 두 점 (x, y)와 (x1, y1) 사이의 거리 구하기
    // 제곱근 계산 : Math.sqrt()
    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
