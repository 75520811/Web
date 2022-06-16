public class cons {

    int id;
    String name;

    cons(int a, String s)
    {
        id =a;
        name =s;
        System.out.println("i am not constructor");
    }

    void car()
    {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args)
    {
        cons obj1 = new cons(3, "ghee");
        obj1.car();

    }
}