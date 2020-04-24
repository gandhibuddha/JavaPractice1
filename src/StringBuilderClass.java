public class StringBuilderClass {
    public static void main(String args []) {
    // StringBuilder when you’re dealing with larger strings or modifying the contents of a string often.It is mutable
    // In contrast to the class String, the class StringBuilder uses a non–final char array to store its value.
    StringBuilder s = new StringBuilder(); // it uses the default constructor with size 16
        s.append(true);
        s.append(10);
        s.append('a');
        s.append(20.99);
        s.append("Hi");
        System.out.println(s); // if s is a string, it doesn't print this
        String s1 = new String("");
        s1.concat("Hi");
        System.out.println(s1); // as s1 is string , it is immutable. we are unable to change the value by methods
        s1 = s1.concat("Hi");
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("bon");
        s2.insert(2,'r'); // insert method adds the literal at specified index
        System.out.println(s2);
        StringBuilder s3 = new StringBuilder("ale");
        char [] name = {'j','p','p','a'};
        s3.insert(1, name, 1,2); // this line says from index 1 select 2 characters i.e p and p
        System.out.println(s3);
        StringBuilder s4 = new StringBuilder("12678345");
        s4.delete(2,5); // it deletes the numbers from index 2 till 4th index
        System.out.println(s4);
        System.out.println(s4.reverse());
        // If you need to access your code from multiple threads, use StringBuffer; otherwise use StringBuilder.
        // The classes StringBuffer and StringBuilder offer the same functionality, with one difference:
        // the methods of the class StringBuffer are synchronized where necessary,
        // whereas the methods of the class StringBuilder aren’t.
        // only one thread out of multiple threads can execute your method is synchronized. string builder is not synchronized.
        
    }
    }
