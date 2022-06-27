package chapter06;

public class Exercise6_3 {
    public static void main(String[] args) {
        Student s =  new Student();
        s.name = "윤성준";
        s.ban = 1;
        s.no = 3;
        s.kor = 100;
        s.eng = 80;
        s.math = 60;

        System.out.println("이름:" + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
    }

    static class Student {
        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;

        int getTotal() {
            return this.kor + this.eng + this.math;
        }

        float getAverage() {
            float num = (float) (this.kor + this.eng + this.math) / 3;
            return (float) Math.round(num * 100) / 100;
        }
    }
}
