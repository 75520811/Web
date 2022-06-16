public class overload {
    static String animal(String a, String b) {
        String c=a+b;
        return c;
    }
    static String animal(String a, String b, String c, String d) {
        String e=a+b+c+d;
        return e;
    }
        public static void main(String[] args) {
        System.out.println(overload.animal("dog","cat"));
        System.out.println(overload.animal("rhino","elephant","lion","tiger"));

    }
}
