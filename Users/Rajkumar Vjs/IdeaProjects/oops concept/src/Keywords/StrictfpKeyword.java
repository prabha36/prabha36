package Keywords;

public class StrictfpKeyword
{
    public strictfp double sum()
    {
        double number1 = 5.5d;
        double number2 = 9.9d;
        return (number1+number2);
    }
    public static strictfp void main(String[] args)
    {
        StrictfpKeyword sk = new StrictfpKeyword();
        System.out.println(sk.sum());
    }
}