package Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(23, 89.0f);
        Student s2 = new Student(8, 90.8F);
        Student s3= new Student(9, 24.0f);
        Student s4 = new Student(19, 89.8F);
        Student s5 = new Student(13, 80.0f);
        Student s6 = new Student(56, 244.8F);
        Student s7 = new Student(24, 566.0f);
        Student s8 = new Student(4, 907.8F);
        Student s9 = new Student(7, 100.0f);
        Student s10 = new Student(34, 190.8F);

        Student[] list={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //ascending order
//                return -(int) (o1.marks-o2.marks);
//            }
//        });
        //lambda exp
       Arrays.sort(list,(o1,o2)->-(int) (o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));

//        if (s1.compareTo(s2) < 0) {
//            System.out.println("s2 has more marks");
//            System.out.println(s1.compareTo(s2));
//        }
//        else{
//            System.out.println("s2 has low marks");
//        }
    }
}
