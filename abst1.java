abstract class language{
    abstract void c();


    }
public class abst1 extends language {
    void c() {
        System.out.println("I am abstract");
    }
    public class abst2 extends language{
        void c() {
            System.out.println("i am language");
        }
    }

    public static void main(String[] args) {
        language obj1= new abst1();
        language obj2 = new abst1();
        obj1.c();
                obj2.c();
    }
}


