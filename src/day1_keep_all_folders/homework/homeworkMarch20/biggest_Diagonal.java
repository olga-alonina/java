package day1_keep_all_folders.homework.homeworkMarch20;

public class biggest_Diagonal {
    /*Given a 2D array with values:
	{3, 5, 1}//00 11 22 i+1 i+1    20 11 02 i-1, i+1
	{1, 6, 10}
	{5, 21, 10}
Calculate and find the biggest diagonal
	if an array was
	a b c
	d e f
	g h i
	aei and ceg would be the diagonals*/
    public static void main(String[] args) {
        int[][] array = {{3, 5, 1}, {1, 6, 10}, {5, 21, 10}};
        //00 11 22 i+1 i+1    20 11 02 i-1, i+1
        int summ = 0;
        int summ2 = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i][i];
            summ2 += array[i][array.length - 1 - i];
        }
        if (summ > summ2) {
            System.out.println("biggest dia is " + summ);
        } else {
            System.out.println("biggest dia is " + summ2);
        }
        System.out.println("*************************");
        char[][] arr = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
        //00 11 22 i+1 i+1    20 11 02 i-1, i+1
        String sum = "";
        String sum2 = "";
        for (char i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            sum2 += arr[i][arr.length - 1 - i];
        }
        System.out.println("biggest dia is " + sum);
        System.out.println("biggest dia is " + sum2);
    }
}




