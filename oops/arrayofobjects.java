  class student{
        
    int roll;
    String name ;
    int marks ;


    }

public class arrayofobjects {
   public static void main(String[] args) {
    student s1 =new student();
        s1.roll=12;
        s1.name ="adarsha";
        s1.marks=21;

    student s2=new student();
        s2.roll=22;
        s2.name="ads";
        s2.marks=23;

        student stu[]=new student[2];
        stu[0]=s1;
        stu[1]=s2;
        System.out.println(stu[0].name);
   }
}
