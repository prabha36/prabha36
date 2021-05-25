package StringHandling;

public class SubString {
    public void checkSubString(String emp1, String emp2) {
        System.out.println("Use sub string starting from 2 : " + emp1.substring(2));
        System.out.println("Use sub string starting from 2 to 5 : " + emp1.substring(2,5));
        System.out.println(emp2.charAt(4));
        System.out.println("Given value : " + emp1 + " " + emp2);

        System.out.println(emp1.trim());
        System.out.println(emp2.trim());
    }

    public static void main(String[] args){
        String empName1=" Rajkumar ";
        String empName2=" Kar thik ";
        SubString sb=new SubString();
        sb.checkSubString(empName1,empName2);
    }
}
