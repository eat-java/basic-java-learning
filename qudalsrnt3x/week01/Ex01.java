package week01;

public class Ex01 {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 1, 1, 100, 60, 76);

        System.out.println("이름:" + student.name);
        System.out.println("총점:" + student.getTotal());
        System.out.println("평균:" + student.getAverage());
        System.out.println("정보:" + student.info());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student() {}

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        return Float.parseFloat(String.format("%.1f", getTotal() / 3f));
    }

    public String info() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }

}
