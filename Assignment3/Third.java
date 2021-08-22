interface Dog {
    public void bark();

}

interface Cat {

    public void meow();

}

class Animal implements Dog, Cat {

    @Override
    public void meow() {
        // TODO Auto-generated method stub
        System.out.println("Cat Meows");
    }

    @Override
    public void bark() {
        // TODO Auto-generated method stub
        System.out.println("Dog Barks");
    }

}