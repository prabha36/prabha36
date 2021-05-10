class Student {
        int mark =90;

}
class Student1 extends Student {

        int mark =95;

    void display() {
        System.out.println("super." +mark);
    }
}

public class SuperMethod {
    public static void main(String args[]) {
        Student1 st= new Student1();
        st.display();
    }
}
