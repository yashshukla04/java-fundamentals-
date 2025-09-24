public class Main {
    public static void main(String[] args) {


                int i = 1;
                while (i <= 5) {
                    int j = 1; // Initialize j inside the outer loop
                    while (j <= i) {
                        System.out.print("* ");
                        j++; // Increment j in the inner loop
                    }
                    System.out.println();
                    i++;
                }
            }
        }

