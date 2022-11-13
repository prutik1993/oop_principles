package class_object;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println(Student.numberOfStudents);//0
        System.out.println(Student.program);


        Student student1 = new Student("John", "Doe", 45);
        // Student.addStudent();
        System.out.println(Student.numberOfStudents);//1
        Student student2 = new Student("Jane", "Doe", 45);
        System.out.println(Student.numberOfStudents);//2

        student1.study();
        student2.rest();
    }
}
