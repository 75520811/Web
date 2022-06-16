public class loop {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int weeks = 3;
        int days = 7;
        // outer loop prints weeks
        for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);
            // inner loop prints days
            for (int j = 1; j <= days; ++j) {
                System.out.println(" day: " + j);
            }
        }
    }
}


