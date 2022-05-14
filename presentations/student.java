

public class student {
    public static void main(String[] args) {
        

        class Student {
            String name ;
            int rollNumber ;
        }

        Student stu1 = new Student();

        Student stu2 = new Student();

        stu1.name = "Adam Lev" ;
        stu1.rollNumber = 12 ;

        stu2.name = "Kesha" ;
        stu2.rollNumber = 13 ;

        System.out.println(stu1.name);
        System.out.println(stu1.rollNumber);
        System.out.println(stu2.name);
        System.out.println(stu2.rollNumber);

    }
}
