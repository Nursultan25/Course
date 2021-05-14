package kg.megacom;

public class Course {
    int id;
    String name;
    int price;
    int duration; // minutes
    Teacher teacher;
    Student[] students;

    public Course() {
    }

    public Course(int id, String name, int price, int duration, Teacher teacher, Student[] students) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.teacher = teacher;
        this.students = students;
    }

    public void studentsCount(int count) {
        students = new Student[count];
    }

    public boolean addStudent(Student student) {
        for (int i=0; i< students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return true;
            }
        }

        return false;
    }


    //TODO реализовать удаление студента по его номеру телефона
    public void removeStudent(String phoneNumber, Student student) {
        String number = student.getPhoneNumber();
        for (int i = 0; i < students.length; i++) {
            if (number == phoneNumber && students[i] == student) {
                students[i] = null;
            }
        }
    }

    //TODO метод Добавить учителя
    public void addTeacher(Teacher newTeacher) {
        teacher = newTeacher;
    }

    //TODO Вывести имя учителя и название курса на экран
    public void print(Course course) {
        System.out.println("Course teacher: " + teacher.fio);
        System.out.println("Course Name: " + course.name);
    }

}
