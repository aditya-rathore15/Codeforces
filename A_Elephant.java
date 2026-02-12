import java.util.Scanner;

/*
This is a Greedy problem because we always choose the largest possible move (5 steps) to minimize total moves.

Taking the largest step each time is locally optimal and guarantees the global minimum since there is no penalty for bigger moves.
 */
public class A_Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int steps = (int) Math.ceil(n / 5.0);
        System.out.println(steps);

    }
}