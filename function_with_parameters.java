import java.util.Scanner;

public class function_with_parameters {

    public static void hello() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = s.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("Hello World");
        }

    }
    public static void main(String[] args) {
        hello();
    }

}
