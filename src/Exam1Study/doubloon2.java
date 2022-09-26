package Exam1Study;

public class doubloon2 {
        /*
    return true if every letter in s appears at least twice
     */

    public static boolean isDoubloon(String s) {

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }
            if (count < 2) {
                return false;
            }

        }
        return true;
    }

    public static void main(String [] args){
        System.out.println(isDoubloon("appeases"));
        System.out.println(isDoubloon("esophagographers"));
        System.out.println(!isDoubloon("hello"));
        System.out.println(isDoubloon("aaabbbccc"));
    }

}
