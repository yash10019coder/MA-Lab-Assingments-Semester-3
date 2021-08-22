abstract class Airthmetic  {
    public abstract int add(int a, int b);

    public abstract int sub(int a, int b);
    
    public abstract int mul(int a, int b);

    public abstract float div(int a, int b);
}

class Add extends Airthmetic {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public float div(int a, int b) {
        return a / b;
    }
}