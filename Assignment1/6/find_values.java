public class find_values {
    public static void main(String[] args) {
        System.out.println("The values of the variables are below");
        int z = 8;
        int a, b, c, d, e, f;
        a = z++ + ++z;
        b = z-- + --z;
        c = z++;
        d = ++z;
        e = z--;
        f = --z;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
