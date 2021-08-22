public class Fourth {
    static int decimal = 0;

    public int binaryToDecimal(int binary, int p) {

        if (binary == 0)
            return decimal;
        else {
            return (binary % 10) * (int) Math.pow(2, p) + binaryToDecimal(binary / 10, p + 1);
        }
    }

    public static void main(String[] args) {
        Fourth obj = new Fourth();
        System.out.println(obj.binaryToDecimal(101101, 0));
    }
}
