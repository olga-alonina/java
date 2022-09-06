package Extra_Tasks;

import java.util.Scanner;

public class RomanToNumbers {
    /*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.


Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */

        public static int numberToRoman(String number){

            String[] arr = number.split("");
            int total = 0;
            for(String each : arr ){
                if(each.equalsIgnoreCase("I")){
                    total += 1;
                }
                else if(each.equalsIgnoreCase("V")){
                    total += 5;
                }
                else if(each.equalsIgnoreCase("X")){
                    total += 10;
                }
                else if(each.equalsIgnoreCase("L")){
                    total += 50;
                }
                else if(each.equalsIgnoreCase("C")){
                    total += 100;
                }else if(each.equalsIgnoreCase("D")) {
                    total += 500;
                }
                else if(each.equalsIgnoreCase("M")) {
                    total += 1000;
                }
                else{
                    total += 0;
                }
            }
            return total;


        }

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            String number = sc.nextLine();

            System.out.println(numberToRoman(number));


        }
    }

