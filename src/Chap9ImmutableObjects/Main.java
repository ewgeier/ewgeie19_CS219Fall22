package Chap9ImmutableObjects;

public class Main {

    public static void main(String[] args) {
        String s = "hello";
        String t = new String("hello");

        // Make a version of s that is capitalized
        String s1 = Character.toUpperCase(s.charAt(0)) + s.substring(1);

        // StringBuilder - mutable strings
        // Character objects are also immutable

        char ch = 'a';
        Character ch1 = 'a';
        //Character ch3 = new Character('a');

        int x = 33;
        // x is primitive so no object
        Integer y = 33;
        //Integer y1 = new Integer(33);
        // y is a reference to an object, 33 is the actual object

        double pi = 3.14159;
        Double pi1 = 3.14159;
        Boolean flag = false;
        Long ll = 43L;
        pi1 = 2.7128; // pi1 is a reference so as pi1 is assigned to a new reference, the original pi1 object is never changed

        // Double, Long, Integer, Boolean, Character are all wrapper classes for their respective primitive type.
        // Taking a primitive value and wrapping it in an object is autoboxing.
        // Turning an object into its primitive is called autounboxing.

        Student student1 = new Student("Hermoine", "Granger", "123", "The Smart One");
        // student1..first = "Harry"; error
        // student1.nickname = ""; // remove Hermione's nickname
        System.out.println(student1); // to string is implicitly called

        Student student2 = new Student("Erik", "Geier", "14004633", "Slick");
        System.out.println(student2);

    }

}
