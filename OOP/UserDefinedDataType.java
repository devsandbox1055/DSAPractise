public class UserDefinedDataType{
    public static class Student {
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args){
        Student s = new Student(); //declaration
        s.name = "khushi";
        s.rno = 23;
        s.cgpa = 8.5;

        Student s2 = new Student(); //declaration
        s2.name = "preet";
        s2.rno = 2;
        s2.cgpa = 8.55 ;

        System.out.println(s.name+" "+s.rno+" "+s.cgpa);
        s.name  = "devesh";
        System.out.println(s.name);
    }
}