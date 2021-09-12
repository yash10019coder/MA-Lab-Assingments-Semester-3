package Question1.information;

public abstract class Citizen
{
    protected String name, aadhar_n,phone_n;
    protected int age;

    public Citizen(String name, String aadhar_n, String phone_n, int age)
    {
        this.name=name;
        this.aadhar_n=aadhar_n;
        this.phone_n=phone_n;
        this.age=age;
    }

    abstract public void verifyAge();
}