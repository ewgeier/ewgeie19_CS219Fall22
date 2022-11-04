package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam2Redo {

    public static String [] load_words(String path, int n){
        // Connect to the webpage of wordle words
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
        String [] words = new String [n];
        int i = 0;
        while (s.hasNextLine()) {
            String nextword = s.nextLine();
            if (isPalindrome(nextword))
                words[i++] = nextword;
        }
        return words;

    }

    public static boolean isPalindrome(String s) {
        if (s.length() < 2)
            return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1) &&
                isPalindrome(s.substring(1, s.length() - 1)))
            return true;
        else
            return false;


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
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 9);
        System.out.println(Arrays.toString(reverse(words)));
    }
}
