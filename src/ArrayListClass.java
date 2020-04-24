import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListClass {
    public static void main(String[] args) {


        //  You can compare an ArrayList with a resizable array. As you know, once it’s created, you can’t increase or decrease the size of an array.
        //  On the other hand, an ArrayList automatically increases and decreases in size as elements are added to or removed from it.
        //  Also, unlike arrays, you don’t need to specify an initial size to create an ArrayList.
        ArrayList<String> al = new ArrayList<>();
        // Because you can use an ArrayList to store any type of Object, ArrayList defines an instance variable
        // elementData of type Object[] to store all its individual elements. Eg: Private transient Object[] elementData;
        //An ArrayList uses an array to store its elements. It provides you with the functionality of a dynamic array.
        al.add("one");
        al.add("two");
        al.add("three");
        al.add(2,"three");
        al.set(2,"two and half");
//        for (String value:al) {
//            System.out.println(value);
//        }
        // An iterator (Iterator or ListIterator) lets you remove elements as you iterate an ArrayList.
        // It’s not possible to remove elements from an ArrayList while iterating it using a for loop.
        ListIterator<String> iterator = al.listIterator(); // this line gets the iterator associated with ArrayList myArrList.
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // You can also modify the existing values of an ArrayList by accessing its individual elements.
        // Because Strings are immutable, let’s try this with StringBuilder.
        ArrayList<StringBuilder> al1 = new ArrayList<>();
        al1.add(new StringBuilder("stringOne"));
        al1.add(new StringBuilder("stringTwo"));
        al1.add(new StringBuilder("stringThree"));
        al1.add(new StringBuilder("StringFour"));
        System.out.println(al1);
        al1.remove(3);  // to remove an element from an index
        for (StringBuilder s:al1)
            s.append(s.length());
        for (StringBuilder s1:al1) {
            System.out.println(s1);
        }
        al.addAll(2,al); // in this step i added a list into the same list from certain index, we can add it to the other lists as well
        for (String each1:al) {
            System.out.println(each1);
        }
    }
}