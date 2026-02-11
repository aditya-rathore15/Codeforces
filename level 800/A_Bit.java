import java.util.Scanner;

public class A_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        String a = "X++";
        String b = "++X";

        String[] str = new String[n];

        for(int i=0; i<n; i++) {
            str[i] = sc.next();
        }

        for(int i=0; i<n; i++) {
            if(str[i].equals(a) || str[i].equals(b)) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}