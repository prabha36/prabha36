import com.sun.org.apache.xpath.internal.objects.XString;

class Studetails{
    int rollNo;
    String name;
    int salary;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int newRollNo) {
        rollNo =newRollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public int getSaraly() {
        return salary;
    }
    public void setSalary(int newSalary) {
        salary= newSalary;
    }
}



public class Encapsulation {
    public static void main(String args[]) {
        Studetails s= new Studetails();
        s.setRollNo(399);
        s.setName("Prabha");
        s.setSalary(10000);
        System.out.println("Your roll number is : " + s.getRollNo());
        System.out.println("Your name is :" + s.getName());
        System.out.println("Your salary : " + s.getSaraly());
    }
}