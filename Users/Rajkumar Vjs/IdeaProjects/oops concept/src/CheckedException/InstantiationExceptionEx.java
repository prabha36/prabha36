package CheckedException;

public class InstantiationExceptionEx
{
    int marks;
    public void display()
    {
        System.out.println("Hello 1");
    }
    public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException
    {
        InstantiationExceptionEx std1 = new InstantiationExceptionEx();
        std1.marks = 50;

        Class cls1 = std1.getClass();

        Object obj1 = cls1.newInstance();
        InstantiationExceptionEx std2 = (InstantiationExceptionEx) obj1;

        System.out.println("std1 marks: " + std1.marks);
        System.out.println("std2 marks: " + std2.marks);
        std2.display();

        Class cls2 = Class.forName("Student");
        Object obj2 = cls2.newInstance();
        InstantiationExceptionEx std3 = (InstantiationExceptionEx) obj2;
        std3.display();
    }
}