import java.util.Scanner;

public class A_Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
    
        s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        System.out.println(s);
    }
}