import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 Integers");
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        if (a > b && a > c && a > d)
            System.out.printf("First Number %d is greatest", a);
        else if (b > a && b > c && b > d)
            System.out.printf("Second Number %d is greatest", b);
        else if (c > a && c > b && c > d)
            System.out.printf("Third Number %d is greatest", c);
        else
            System.out.printf("Fourth Number %d is greatest", d);

        if (a < b && a < c && a < d)
            System.out.printf("First Number %d is greatest", a);
        else if (b < a && b < c && b < d)
            System.out.printf("Second Number %d is greatest", b);
        else if (c < a && c < b && c < d)
            System.out.printf("Third Number %d is greatest", c);
        else
            System.out.printf("Fourth Number %d is greatest", d);
        int min, max;
        max = ((a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d))
                : ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d)));
        // minimum
        min = ((a < b) ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))
                : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d)));
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);
    }
}
