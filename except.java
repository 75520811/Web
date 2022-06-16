package exception;
import java.io.*;

public class except {
    public static void main(String[] args) {
        try {
            FileOutputStream obj1 = new FileOutputStream("D:\\java");
            String C="Welcome";
            byte b[]=C.getBytes();
            obj1.write(b);
            obj1.write(98);
            obj1.close();
            System.out.println("Byte");
        }
    }
}
