package Comparing;

public class Student implements Comparable<Student> {
    int rollNo;
    float marks;
    public Student(int rollNo,float marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }
    public String toString(){
       return  marks+" ";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("comparing method");
        int diff=(int)(this.marks-o.marks);
        return diff;
    }
}
