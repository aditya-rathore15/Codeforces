import java.util.Scanner;

class A_Domino_piling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        int result = (m * n) / 2;
        System.out.println(result);
    }
}