package week1;

class Exercise6_1 {

    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }


}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAvg() {
        return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
    }

    public String info() {
        return name + ","
                + ban + ","
                + no + ","
                + kor + ","
                + eng + ","
                + math + ","
                + getTotal() + ","
                + getAvg();
    }
}
