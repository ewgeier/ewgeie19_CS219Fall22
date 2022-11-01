package Exam2Study;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Exam2Practice {

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

    public static void trs_words (String [] words){
        for (String w : words){
            if (w.length() == 5 && w.charAt(0) == 't' && w.charAt(4) == 'r'){
                String middle = w.substring(1,4);
                if (middle.indexOf('s') > -1){
                    System.out.println(w);
                }
            }
        }
    }


    public static void main(String[] args) {
        String[] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);

        trs_words(words);


    }
}
