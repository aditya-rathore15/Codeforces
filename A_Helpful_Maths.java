import java.util.Scanner;
import java.util.Arrays;

public class A_Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] numbers = s.split("\\+");
        Arrays.sort(numbers);
        System.out.println(String.join("+", numbers));
    }
}