import java.util.Scanner;

class Volume {
    int l, b, h;

    public Volume(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Volume(int l) {
        this.l = l;
        b = h = 0;
    }

    public int volumeCube() {
        return l * l * l;
    }

    public int volumeCuboid() {
        return l * b * h;
    }
}

class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENter side of the cube to find volume of the cube");
        Volume cube = new Volume(scanner.nextInt());
        System.out.println("Volume of the cube is" + cube.volumeCube());
        System.out.println("Enter the parameters of the cuboid to find its volume");
        cube = new Volume(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Volume of the cuboid is" + cube.volumeCuboid());
        scanner.close();                                                            
    }

}