package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exam {

    public static String [] load_words(String path, int n){
        // Connect to the webpage of speeds
        URL url = null; // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // Create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String [n];
        int i = 0;
        while (s.hasNextLine()){
            words[i++] = s.nextLine();
        }

        return words;
    }

    public static String [] palindrome(String [] words) {
        for (int i = 0; i < words.length - 1; i++){
            if (words[i].charAt(0) != words[i].charAt(4) ||
                    words[i].charAt(1) != words[i].charAt(3))
                words = words - words[i];
            }
        return words;
        }


    public static String[] reverse(String [] words){
        for (int i = 0; i < words.length/2; i++){
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;

        }
        return words;
    }



    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);
        System.out.println(reverse(palindrome(words)));
    }

}
