package chapter6;


/*
* NOTE: 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야하는 속성의 경우 클래스 변수로 정의할 수 있다.
* */
class Ex6_7 {

    // Marine

    int x = 0, y = 0;
    int hp = 60;
    int weapon = 6; // static 당첨
    int armor = 0;  // static 당첨

    void weaponUp() {
        weapon++;
    }

    void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
