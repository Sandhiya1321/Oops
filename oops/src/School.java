public interface School{
    void marks();
     interface Person{
        void marks();
    }
    class Student implements School,Person{
         String name;
         int studId;
         String schoolName;
         Student(String name,int studId,String Schoolnme){
             this.name=name;
             this.studId=studId;
             this.schoolName=Schoolnme;
         }
         public void ShowDetails(){
             System.out.println("name of the student: "+name);
             System.out.println("name of the student id: "+studId);
             System.out.println("name of the school name: "+schoolName);

         }
        @Override
        public void marks() {
            System.out.println("marks will be published soon");
        }
    }

    public static void main(String[] args) {
        Student stud = new Student("sandy",9087,"marys");
        stud.ShowDetails();
        stud.marks();
    }
}