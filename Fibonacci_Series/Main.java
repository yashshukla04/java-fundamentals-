import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();

        int first = 0 , second = 1;
        System.out.print("Fibonaaci Series: " + first + " " + second + " ");
        int count = 2;
        while (count < terms) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            count++;
        }

    }
}