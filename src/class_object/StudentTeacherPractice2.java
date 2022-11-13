package class_object;

public class StudentTeacherPractice2 {
    public static void main(String[] args) {
        /*
        Create a Teacher object -> Alex Smith
        Create 4 Student objects    -> John Doe 15
                                    -> Jane Doe 20
                                    -> Mike Smith 25
                                    -> Robert Smith 50

        Add students to Teacher Student List
        Find the age difference bt the oldest and youngest student

        Expected:
        35
         */

        Teacher teacher = new Teacher("Alex", "Smith");

        Student student1 = new Student("John", "Doe", 15);
        Student student2 = new Student("Jane", "Doe", 20);
        Student student3 = new Student("Mike", "Smith", 25);
        Student student4 = new Student("Robert", "Smith", 50);

        teacher.addStudent(student1);
        teacher.addStudent(student2);
        teacher.addStudent(student3);
        teacher.addStudent(student4);

        Student yong = student1;
        Student old = student1;
        for (Student s : teacher.getStudents()) {
           if(s.age > student1.age) old = s;
           if(s.age < student1.age) yong = s;
        }

        System.out.println(old.age - yong.age);

    }

}
