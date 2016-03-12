package Lesson7.OverrideHashCode;


public class DemoPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Address ad1 = new Address("Kyiv", "Lepse", 6);
        Address ad2 = new Address("Kyiv", "Vasilkovskaya", 6);
        Address ad3 = new Address("Kyiv", "Lepse", 6);

        p1.setName("Ivan");
        p1.setAge(11);
        p1.setSalary(1000);
        p1.setAddress(ad1);

        p2.setName("Nikolay");
        p2.setAge(22);
        p2.setSalary(5000);
        p2.setAddress(ad2);

        p3.setName("Ivan");
        p3.setAge(11);
        p3.setSalary(1000);
        p3.setAddress(ad3);

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p3 == p2);
        System.out.println("--------------------");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p2));

//        System.out.println("-------------------------");
//        System.out.println(ad1.equals(ad2));
//        System.out.println(ad1.equals(ad3));
//        System.out.println(ad3.equals(ad2));

        System.out.println("---------------------");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());


    }
}
