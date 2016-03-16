package Lesson7.stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("1");
        st.push("2");
        st.push("3");
        st.push("4");
        st.push("5");
        st.push("6");
        st.printList();

        System.out.println(st.pop());
        System.out.println(st.peak());
        st.printList();
    }
}
