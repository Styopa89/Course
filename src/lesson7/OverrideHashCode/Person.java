package lesson7.OverrideHashCode;


public class Person {
    private String name;
    private int age;
    private long salary;
    private Address address;

    public Person() {
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 37 * result + name.hashCode();
        result = 37 * result + ((Integer) age).hashCode();
        result = 37 * result + ((Long) salary).hashCode();
        if (address != null) {
            result = 37 * result + address.hashCode();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return (name != null && name.equals(p.getName()) && age == p.getAge() && salary == p.getSalary()
                   && address.equals(p.getAddress()));
        }
        return false;
    }
}
