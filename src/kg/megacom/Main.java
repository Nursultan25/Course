package kg.megacom;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student harryPotter = new Student("Harry Potter", "+996555555555", true);
        Student hermione = new Student("Hermione", "+9965559844566", false);
        Student ronWisley = new Student("Ron Wisley", "+996555753495", false);
        Student nursultan = new Student("Nursultan", "+996550243967", true);
        Teacher SeverusSnape = new Teacher("Severus Snape", 120000);

        Course course = new Course();
        course.name = "Poisons";

        course.studentsCount(15);
        course.addStudent(harryPotter);
        course.addStudent(hermione);
        course.addStudent(ronWisley);
        course.addStudent(nursultan);

        course.addTeacher(SeverusSnape);

        course.removeStudent("+996555753495", ronWisley);

        course.print(course);

        System.out.println("Students: " + Arrays.toString(course.students));
        System.out.println("Teacher: " + Arrays.toString(new Teacher[]{course.teacher}));
    }
}

//Известно множество способов сделать это неправильно, и неясно, какой из них правильный.