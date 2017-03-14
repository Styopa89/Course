package lesson7.Frame5;


import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public void enter(Student s){
        students.add(s);
    }

    public void leave(Student s){
        students.remove(s);
    }

    public int getStudentCount(){
        return students.size();
    }

    public boolean isPresent(Student s) {
       return students.contains(s);
    }

    public void printStudentInfo (){
        for (int i=0; i < students.size(); i++) {
            System.out.println(students.get(i).getName() + " " + students.get(i).getSecondName());
        }
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }
}
