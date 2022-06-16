//hierarchical inheritance
//parent class
class india{
    void country(){
        System.out.println("India is my country");
    }
}
//child class1
 class AP{
    void country(){
        System.out.println("Ap is in India");
    }
}
//child class2
class TN{
    void country(){
        System.out.println("Karnataka is in India");
    }
}
public class inherit3 {
    public static void main(String[] args) {
        TN state1=new TN();
        state1.country();
        AP state2=new AP();
        state2.country();
    }
}
