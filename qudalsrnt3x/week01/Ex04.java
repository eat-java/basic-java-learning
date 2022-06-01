package week01;

class MyPoint {

    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) { // 인스턴스 변수를 사용해서 작업하므로 인스턴스 메서드로 구현
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
    }
}

public class Ex04 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        // p와 (2, 2)의 거리를 구한다.
        System.out.println(p.getDistance(2, 2));
    }
}
