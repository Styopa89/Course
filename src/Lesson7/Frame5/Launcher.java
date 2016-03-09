package Lesson7.Frame5;


public class Launcher {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        Student student= new Student();
        student.setName("Andrey");
        student.setSecondName("Andreychuk");
        classroom.enter(student);

        student = new Student();
        student.setName("Petro");
        student.setSecondName("Petrenko");
        classroom.enter(student);

        student = new Student();
        student.setName("Ivan");
        student.setSecondName("Ivanov");
        classroom.enter(student);
//        classroom.leave(student);

        System.out.println(classroom.getStudentCount());
        classroom.printStudentInfo();
        System.out.println(classroom.isPresent(student));

    }
}
