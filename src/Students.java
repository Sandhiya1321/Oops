public class Students {
    private String name;
    int rollNo;
    String department;
    float cgpa;
    float attendance;


    public static void main(String[] args) {
        Students stu=new Students("sandy",1,"cse",6.9f,80.0f);
        System.out.println(stu.getName());
        stu.setName("san");
        System.out.println(stu.getName());
    }
    public Students(String name, int rollNo, String department, float cgpa, float attendance) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.cgpa = cgpa;
        this.attendance = attendance;

    }

    //to return the object here return type is students
    //to find maximum
    //user defined datatype ex:student(created class  is datatype)
    public static Students findTopper(Students[] arr) {
        Students max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].cgpa > max.cgpa) {
                max = arr[i];
            }
        }
        return max;

    }
public static Students findLowAttendance(Students []arr){
        Students min=arr[0];
    for (int i = 1; i < arr.length; i++) {
        if(arr[i].attendance<min.attendance){
            min=arr[i];
        }
    }
    return min;
    }
public static Students[] sortRollNo(Students[] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length-1-i; j++) {
          if(arr[i].rollNo>arr[i+1].rollNo) {
              //Swapping objects
              Students temp = arr[i];
              arr[i] = arr[i + 1];
              arr[i + 1] = temp;
          }
        }
    }
    return arr;
}
public String getName(){
        return this.name;
}
public void setName(String newName){
        this.setName("san");
}
}

