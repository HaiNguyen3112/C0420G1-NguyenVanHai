package IntroductionJava.TH.Bai12.MapNSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private int age;
    protected String address;


    public Student() {
    }

    public Student( String name, int age, String address ) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress( String address ) {
        this.address = address;
    }

    public String toString(){
        return "Student name: "+getName()+", Age: "+getAge()+", Address: "+getAddress();
    }

    public static void main( String[] args ) {
        Student student1= new Student("Hải",26,"Hà Nam");
        Student student2= new Student("Đông",25,"Ninh Bình");
        Student student3= new Student("An",26,"Bắc Ninh");

        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        System.out.println("Display in HashMap: ");
        for (Map.Entry<Integer,Student> std : studentMap.entrySet()){
            System.out.println(std.toString());
        }

        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
