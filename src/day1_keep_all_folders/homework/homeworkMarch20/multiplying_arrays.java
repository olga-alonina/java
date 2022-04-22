package day1_keep_all_folders.homework.homeworkMarch20;

public class multiplying_arrays {
    public static void main(String[] args) {
        /*
Ex:
	{1, 2, 3}
	{2, 5, 10}
	{0, 3, 20}
		x
	{10, 4, 3}
	{5, 2, 7}
	{100, 20, 5}
Output:
	{10, 8, 9}
	{10, 10, 70}
	{0, 60, 100}*/
        int[][] arr1 = {{1, 2, 3}, {2, 5, 10}, {0, 3, 20}};
        int[][] arr2 = {{10, 4, 3}, {5, 2, 7}, {100, 20, 5}};
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {//arr1 outs
            for (int j = 0; j < 3; j++) {//arr2 outs
                result[i][j] += arr1[i][j] * arr2[i][j];

                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}





