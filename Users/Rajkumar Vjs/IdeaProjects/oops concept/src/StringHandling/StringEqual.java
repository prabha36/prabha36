package StringHandling;

public class StringEqual {
    public void checkString(String fn, String ln) {
        System.out.println("To check the first name is equalto last name " + fn.equals(ln));
        System.out.println("Ingore UpperCase and LowerCase "+ ln.equalsIgnoreCase(fn));
    }
}