class A{
    int a,b;
    public void show()
    {
        System.out.println("Hello From A");
    }
}

class B extends A{
    int c,d;
    public void write()
    {
        System.out.println("Hello from B");
    }
}


class Main{
    public static void main(String args[])
    {
        B b=new B();
        b.show();
        b.write();
    }
}