import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");


    }


}