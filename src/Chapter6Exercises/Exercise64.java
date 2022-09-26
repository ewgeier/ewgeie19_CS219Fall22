package Chapter6Exercises;

public class Exercise64 {

    public static String toLower(String s){

        String r = "";
        for ( int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if ('A'<= ch && ch <= 'Z'){
                r = r + (char) ('a' + (ch - 'A'));
            }
            else
                r = r + ch;
        }
        return r;
    }


    public static boolean isAlphabetical(String s){
        s = s.toLowerCase(); // convert it all to lowercase
        int i = 0;
        while (i < s.length() - 1){
            if (s.charAt(i) >= s.charAt(i + 1)){
                return false;
            }
            i++;
        }
        // End of while loop
        return true;
    }

    public static boolean isAbecedarian(String s){
        s = toLower(s);

        for(int i = 0; i < s.length() - 1; i++){

            if (s.charAt(i) >= s.charAt(i + 1)){
                return false;
            }

        }
        // End of for loop
        return true;
    }

    public static void main (String [] args){
        System.out.println(isAbecedarian("biopsy"));
        System.out.println(!isAbecedarian("apple"));
        System.out.println(isAlphabetical("biopsy"));
        System.out.println(!isAlphabetical("Apple"));
        System.out.println(toLower("APPLE"));
        System.out.println(toLower("APpLe"));
        System.out.println(toLower("Apple%^&*"));
    }

}
