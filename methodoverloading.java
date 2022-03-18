public class methodoverloading {
    public void m1()
    {
        System.out.println("no_arg");

    }
    public void m1(int i)
    {
        System.out.println("int_arg");
    }

    public static void main(String[] args) {
        methodoverloading mo=new methodoverloading();
        mo.m1();
        mo.m1(10);
    }
}
