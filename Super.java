class First
{
    public First(int a)
    {
       //super();
        System.out.println("First constructor"+a);
    }
}
class Second1 extends First
{
    Second1(int b, int c, int d)
    {
        super(b);
        System.out.println("Second1 constructor");
    }
}
class Third extends Second1
{
    Third(int ta, int tb, int tc, int td)
    {
        super(ta,tb,tc); // super() is must be 1st statement of constructor
        System.out.println("Third constructor");
    }
}
public class Super {
    public static void main(String[] args) {
        Third obj1 = new Third(12, 13 ,14,15 );

    }
}
