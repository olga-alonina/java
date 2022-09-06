package day1_keep_all_folders.May.May_21_day61_maps.CB.Map2;

import java.util.HashMap;
import java.util.Map;

public class allSwap {
    /*We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
     Loop over and then return the given array of non-empty strings as follows: if a string matches
      an earlier string in the array, swap the 2 strings in the array. When a position in the array
       has been swapped, it no longer matches anything. Using a map, this can be solved making just
       one pass over the array. More difficult than it looks.
allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]*/
    public static String[] allSwap(String[] strings) {
        String[] news = new String[strings.length];
        Map<String,String>map = new HashMap<>();


        return news;
    }

    public static void main(String[] args) {
        String[]str = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        System.out.println(allSwap(str));
    }

}
