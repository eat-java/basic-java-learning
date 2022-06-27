package chapter06;

public class Exercise6_2 {
    public static void main(String[] args) {
        Student s = new Student("윤성준", 1, 3, 100, 80, 60);

        String str = s.info();
        System.out.println(str);
    }

    static class Student {
        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;

        Student(String name, int ban, int no, int kor, int eng, int math) {
            this.name = name;
            this.ban = ban;
            this.no = no;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        String info() {
            return this.name;
        }
    }
}
