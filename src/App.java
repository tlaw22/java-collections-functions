import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        String sep = "=====================";
        // boolean hasValue = list1.contains(65); checks isf the list contains
        // List1.clear(); clears the list
        // boolean hasValue = list1.isEmpty(); checks to see if the list is empty
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(45);
        list1.add(55);
        list1.add(65);
        list1.add(75);
        list1.add(85);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.addAll(list1);
        System.out.println(list2);
        boolean hasValue = list1.contains(65);
        System.out.println(sep);
        System.out.println(hasValue);
        list2.retainAll(list1);
        System.out.println(list2);
        System.out.println(sep);

        HashSet<Integer> list3 = new HashSet<Integer>();
        list3.add(95);
        list3.add(96);
        list3.add(97);
        list3.add(98);
        list3.add(98);
        HashSet<Integer> list4 = new HashSet<Integer>();
        list2.add(100);
        list2.addAll(list1);
        System.out.println(list2);
        List<Integer> list5 = new ArrayList<Integer>(list3);
        Collections.sort(list5);
        System.out.println(sep);
        System.out.println(list5);

        HashSet<Employee> list6 = new HashSet<Employee>();
        list6.add(new Employee("John", 20000, "Sales"));
        list6.add(new Employee("Joseph", 15000, "Crew"));
        list6.add(new Employee("Peter", 40000, "Tech"));
        list6.add(new Employee("Paul", 50000, "MGMT"));
        ArrayList<Employee> list7 = new ArrayList<Employee>(list6);
        Collections.sort(list7);
        System.out.println(list7);
    }
}
