package HW5;
/*
Erik Geier
HW5
10/03/2022
 */

public class Exercise66 {
    public static boolean canSpell(String word, String tiles){
        int l = tiles.length();
        int i = 0;
        int j = 0;
        while(i < word.length()){
            if (word.charAt(i) == tiles.charAt(j)){
                tiles = tiles.substring(0, j) + tiles.substring(j + 1);
                i++;
                j = 0;
            }
            else if (j < (tiles.length() - 1)) {
                j++;
            }
            else
                break;
        }
        if (i == word.length())
            return true;
        else
            return false;
    }
public static void main(String [] args){
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(canSpell("fright", "appgdpfrdopidmvhdjmvfjmdjt"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("finallygotit", "fnfvainfjfldfldjndvngtvnjvoysdvjnsjysvgksvisvjntvsvnyvdvo"));
        System.out.println(!canSpell("aaaa", "babababbb"));
        System.out.println(canSpell("amazing", "gnifsfamfjfafkxzjfi"));


}

}


//if (word.charAt(i) == tiles.charAt(j)){
//        tiles = tiles.substring(0,j) + tiles.substring(j + 1);

//        }
//        else
 //       return false;