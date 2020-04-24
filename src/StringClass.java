public class StringClass {
    public static void main(String args []){
        String s = new String("apple");
        String s1 = new String("apple");
        System.out.println(s == s1);
        String s2 = "apple";
        String s3 = "apple";
        String s4 = "Apple";
        System.out.println(s2 == s3);
        System.out.println(s.equals(s1));
        System.out.println("apple is equals to apple " +s2.equals(s3));
        System.out.println(s4 == s3);
        // The hashcode of a Java Object is simply a number, it is 32-bit signed int
        // If two objects are equals then these two objects should return same hash code.
        //String objects are immutable. Being immutable guarantees that hashcode will always the same.
        // Immutable simply means unmodifiable or unchangeable.
        //Once string object is created its data or state can't be changed but a new string object is created.
        // If a String object is created using the keyword new, it always results in the creation of a new String object.
        // String objects created this way are never pooled. When a variable is assigned a String literal using the assignment operator,
        // a new String object is created only if a String object with the same value isn’t found in the String constant pool.
        String s5=" Sachin";
        s5.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s5);//will print Sachin because strings are immutable objects
        s5=s5.concat(" Tendulkar");
        System.out.println(s5);
        System.out.println(s5.length());
        System.out.println(s5.indexOf("z")); // if the method does not find any matching, then it returns -1
        System.out.println(s5.indexOf('a',2)); // it returns the index of the character the nth time mentioned
        String s6 = s5.substring(6); // it returns the substring from the position mentioned using index
        System.out.println(s6);
        String s7 = s5.substring(7,10); // it returns the value from 6 index to 8 as 9th is excluded
        System.out.println(s7); // Length of String returned by substring() = end - start . it means 10-7=3
        System.out.println(s5.trim()); // it trimmed the leading space in sachin tendulkar string
        // The trim() method returns a new String by removing all the leading and trailing white space in a String.
        // Note that trim() doesn’t remove the space within a String.
        System.out.println(s5);
        s5 = s5.replace('S','b');
        System.out.println(s5.replace('S','b'));
        System.out.println(s5); // we have reassigned s5 with s5.replace method. so, it is updated.
        System.out.println(s5.startsWith(" "));
        System.out.println(s5.endsWith("ar"));
        String letters = "ABCAB";
        System.out.println(letters.substring(0, 2).startsWith("A")); // if A is mentioned as char, this line fails
        System.out.println("1"+2+3); //Execution is evaluated from left to right. so 123
        String lang1 = "java";
        String lang2 = "jascala";
        String rv = lang1.substring(0,2);
        String rv1 = lang2.substring(0,2);
        System.out.println(rv == rv1);
        System.out.println(rv.equals(rv1));
    }
}
// Because java uses the concept of string literal.Suppose there are 5 reference variables,all refers to one object "sachin".
// If one reference variable changes the value of the object, it will be affected to all the reference variables.
// That is why string objects are immutable in java.The immutability increases the performance
// The class String stores its values in a private variable of the type char array (char value[]).
// Arrays are fixed in size and don’t grow once initialized.