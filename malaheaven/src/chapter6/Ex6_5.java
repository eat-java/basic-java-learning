package chapter6;



/*
* NOTE:
* 클래스 변수: width, height
* 인스턴스 변수: kind, num
* 지역변수: k, n, card, args
* */
public class Ex6_5 {

    int kind;
    int num;

    static int width;
    static int height;

    public Ex6_5() {

    }

    public Ex6_5(int k, int n) {
        this.kind = k;
        this.num = n;
    }

    public static void main(String[] args) {
        Ex6_5 card = new Ex6_5(1, 1);
    }
}
