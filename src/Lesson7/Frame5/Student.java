package Lesson7.Frame5;

public class Student {
    private String name;
    private String secondName;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student s = (Student) obj;
            if (getName() != null && getName().equals(s.getName()) &&
                    getSecondName() != null &&  getSecondName().equals(s.getSecondName()))
            return true;
        }
        return false;
    }
}
