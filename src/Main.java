import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //for storing multiple datatypes we create an array for the class we created
        Students[] studentarr=new Students[2];
       Scanner scan =new Scanner(System.in);
        for (int i = 0; i < studentarr.length; i++) {
            System.out.println("enter name:");
        String name=scan.nextLine();
            System.out.println("enter rollNo:");
        int rollNo=scan.nextInt();
        scan.nextLine();
            System.out.println("enter dept:");
        String department=scan.nextLine();
            System.out.println("enter cgpa");
        float cgpa=scan.nextFloat();

            System.out.println("enter attendance:");
        float attendance=scan.nextFloat();
            scan.nextLine();

            studentarr[i]=new Students(name,rollNo,department,cgpa,attendance);

        }


//        for (int i = 0; i < studentarr.length; i++) {
//            System.out.println(studentarr[i].name);
//        }
//       Students res= Students.findTopper(studentarr);
//        System.out.println("topper is   "+res.name);
//
//        Students res1= Students.findLowAttendance(studentarr);
//        System.out.println("LowAttendance is   "+res1.name);

        System.out.println("sorted list:");
        Students[] result2=Students.sortRollNo(studentarr);
        for (int i = 0; i < studentarr.length; i++) {
            System.out.println(result2[i].rollNo);
//            System.out.println(result2[i].name);
        }
        Students stud=new Students("sandy",1,"cse",6.9f,80.0f);
        System.out.print(stud.getName());
    }

}