package com.company;
import java.util.*;

class Demo
{
    String name = "";
    public int count = 0;
    public void animalName(String animal, List<String> list)
    {
        synchronized (this)
        {
            name = animal;
            count = count + 1;
        }
        list.add(animal);
    }
}

public class SynchronizationBlock
{
    public static void main(String[] args)
    {
        Demo tiger = new Demo();
        List<String> list  = new ArrayList<String>();
        tiger.animalName("Tiger",list);
        System.out.println("Animal's name is "+tiger.name);
    }
}
