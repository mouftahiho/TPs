package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(1,5,6,9,16);
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list3= new ArrayList<>();


        /*list.add(12);
        list.add(23);
        list.add(23);
        list.add(12);
*/
        list3.add(5); // i = 0
        list3.add(10); // i = 1
        list3.add(15); // i = 2
        list3.add(20); // i = 3
        list3.add(2,10);

        for(Integer e :list){
            System.out.println(" element "+e);
        }


      //  list.forEach(i-> System.out.println(" element "+i));

       // list2.stream().map(i -> i*i).filter(i -> i>37 ).forEach(i-> System.out.println(i));

        list3.forEach(i-> System.out.println(i));

    }
}
