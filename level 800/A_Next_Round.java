import java.util.Scanner;

public class A_Next_Round {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] score = new int[n];

        for(int i=0; i<n; i++) {
            score[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            if (score[i] >= score[k-1] && score[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}