package programmers.queue;

import java.util.Comparator;

public class PriorityQueue {

    public static class Student {
        public String name;
        public int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return "Name : " + this.name + ", Age : " + this.age;
        }
    }

    public static void main(String[] args) {
        //        Comparator<Student> comparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.getAge() > o2.getAge()) {
//                    return 1;
//                } else if (o1.getAge() < o2.getAge()) {
//                    return -1;
//                }
//                return 0;
//            }
//        };

        Comparator<Student> comparator = (o1, o2) -> { return o1.getAge() < o2.getAge() ? 1 : o1.getAge() > o2.getAge() ? -1 : 0; };
        java.util.PriorityQueue<Student> pQueue = new java.util.PriorityQueue<>(comparator);

        Student student1 = new Student("Nandini", 30);
        Student student2 = new Student("Anmol", 25);
        Student student3 = new Student("Palak", 28);

        pQueue.add(student1);
        pQueue.add(student2);
        pQueue.add(student3);

        while(!pQueue.isEmpty()) {
            System.out.println(pQueue.poll());
        }
    }
}