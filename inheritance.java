//parent class
class bike{
    void ride() {
        System.out.println("Exclusive bikes");
    }

    }
    class honda extends bike{
    void milage(){
        System.out.println("Honda speed bike");
    }
}

public class inheritance {
    public static void main(String[] args) {
        honda bike1=new honda();
        bike1.milage();
        bike1.ride();
    }
}
