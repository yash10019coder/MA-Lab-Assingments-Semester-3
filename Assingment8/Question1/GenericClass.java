package Question1;
import java.util.*;

class ObjInfo<T extends Collection<?>> 
{
    T collection;
    public ObjInfo(T c) 
    {
        this.collection = c;
    }
    
    private void printInfo() 
    {
        System.out.println("Type: " + collection.getClass().getSimpleName());
        System.out.println("Length: " + collection.size());
        System.out.println("Elements: ");

        for(Object o : ((Collection<?>) collection))
        {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        ObjInfo<ArrayList<Integer>> obj1 = new ObjInfo<>(arrayList);
        obj1.printInfo();
        System.out.println("-----------------------------------");
        List<String> list= new ArrayList<>();
        list.add("Spring");
        list.add("Summer");
        list.add("autumn");
        list.add("winter");
        ObjInfo<List<String>> obj2 = new ObjInfo<>(list);
        obj2.printInfo();
        System.out.println("-----------------------------------");
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        set.add('b');
        ObjInfo<Set<Character>> obj3 = new ObjInfo<>(set);
        obj3.printInfo();
        System.out.println("-----------------------------------");
        Map<Integer,Character> map = new HashMap<>();
        map.put(65,'A');
        map.put(66,'B');
        map.put(67,'C');
        ObjInfo<Set<Character>> obj4 = new ObjInfo<>(set);
        obj4.printInfo();
    }
}
