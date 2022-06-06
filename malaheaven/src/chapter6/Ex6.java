package chapter6;

public class Ex6 {

    // 6_1
    static class Student {

        String name; // 학생이름
        int ban;     // 반
        int no;      // 번호
        int kor;     // 국어점수
        int eng;     // 영어점수
        int math;    // 수학점수

        public Student() {
        }

        // for 6_2
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
            return (getTotal() / 3f);
        }

        public String info() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", ban=" + ban +
                    ", no=" + no +
                    ", kor=" + kor +
                    ", eng=" + eng +
                    ", math=" + math +
                    ", total=" + getTotal() +
                    ", average =" + getAverage() +
                    '}';
        }
    }

    public static void main(String[] args) {
        // 6_2
        Student s1 = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s1.info();
        System.out.println(str);

        // 6_3
        Student s2 = new Student();
        s2.name = "홍길동";
        s2.ban = 1;
        s2.no = 1;
        s2.kor = 100;
        s2.eng = 60;
        s2.math = 76;

        System.out.println("name = " + s2.name);
        System.out.println("total = " + s2.getTotal());
        System.out.println("average = " + s2.getAverage());
    }
}
