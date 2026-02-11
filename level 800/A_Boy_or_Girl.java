import java.util.Scanner;
import java.util.HashSet;

public class A_Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        HashSet<Character> charSet = new HashSet<>();
    
        for(char c : s.toCharArray()) {
            charSet.add(c);
        }

        if(charSet.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}