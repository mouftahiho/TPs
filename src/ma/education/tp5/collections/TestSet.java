package ma.education.tp5.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {
        //Comparator<Client> comparator = new CodeComparator();
        Set<String> set1 = new HashSet<String>();
        Set<Client> set2 = new HashSet<Client>();
        Set<Integer> set3 = new TreeSet<>();
        Set<Client> set4 = new TreeSet<>((c1,c2) -> c1.code-c2.code);
      /*  set1.add("ABC1");
        set1.add("ABC2");
        set1.add("ABC3");
        set1.add("ABC1");
        set1.add("ABC4");
        set1.add("ABC5");
        set1.forEach(i-> System.out.println(i));


        set2.add(new Client(1,"MOUFTAH"));
        set2.add(new Client(2,"HAMMA"));
        set2.add(new Client(1,"HAMMA"));
        set2.forEach(i-> System.out.println(i));


        set3.add(22);
        set3.add(11);
        set3.add(15);
        set3.add(9);
        set3.forEach(i-> System.out.println(i));
*/
        set4.add(new Client(1,"OMAR"));
        set4.add(new Client(3,"SAID"));
        set4.add(new Client(2,"HASSAN"));
        set4.forEach(i-> System.out.println(i));
    }


}

