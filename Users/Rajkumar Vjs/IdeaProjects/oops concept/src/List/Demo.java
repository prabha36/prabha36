package List;

 class Demo
{
    private int a;
    int getValue()
    {
        return a;

    }
    void setValue(int x)
    {
        a=x;
    }
}
 class Encapsulation
{
    public static void main(String[] args)
    {
        Demo obj = new Demo();
        obj.setValue(10);
        int b = obj.getValue();
        System.out.println(b);
    }
}
