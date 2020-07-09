class A
{
    public void show()
    {
        System.out.println("In Class A");
    }
}
public class AnonymousExample
{
    public static void main(String[] args)
    {
        A obj = new A()
                {
                    public void show()
                    {
                        System.out.println("This is anonymous Class");
                    }
                };
        obj.show();
    }
}
