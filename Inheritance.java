public class Inheritance {
    public static void main(String[] args) {
        c c1=new c();
        c1.m1();
        c1.m2();
    }
}
class p
{
    public static void m1()
    {
        System.out.println("parent");
    }
}
class c extends p{
    public void m2()
    {
        System.out.println("child");
    }
}
