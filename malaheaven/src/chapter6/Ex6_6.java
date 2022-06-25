package chapter6;

class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Double getDistance(int i1, int i2) {
        return Ex6_4.getDistance(x, y, i1, i2);
    }
}

public class Ex6_6 {

    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2, 2));
    }
}
