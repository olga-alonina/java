package day1_keep_all_folders.homework.homeworkMarch12;

public class even_or_odd_in_array {
    public static void main(String[] args) {
        //Input:
        //Output:
        //Even: 2
        //Odd: 3
        int Even = 0;
        int Odd = 0;
        String evenNumb= "";
        String oddNumb = "";
        int[] numbers = {4,1,3,12,5};
       /* for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                Even++;
                evenNumb+=numbers[i]+", ";
            } else {
                Odd++;
                oddNumb+=numbers[i]+", ";
            }
        }
        System.out.println("Even = " + Even);
        System.out.println("evenNumb = " + evenNumb);

        System.out.println("Odd = " + Odd);
        System.out.println("oddNumb = " + oddNumb);*/
        for(int number:numbers){
            if (number % 2 == 0) {
                Even++;
                evenNumb+=number+" ";
            } else {
                Odd++;
                oddNumb+=number+" ";
            }
        }System.out.println("Even = " + Even);
        System.out.println("evenNumb = " + evenNumb);

        System.out.println("Odd = " + Odd);
        System.out.println("oddNumb = " + oddNumb);
        }
    }



