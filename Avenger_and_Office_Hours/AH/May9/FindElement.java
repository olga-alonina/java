package AH.May9;


/* Given an array of integers, write a function to return the item in the array,
 where the sum of all items on its left is equal to
the sum of the ones on the right.
For example :Given [4, 9, 1, 3, 6, 4] your function should give item 1, because 4+9 = 3+6+4*/
public class FindElement{
   public static int findElement(int arr[]) {
        int rightSum = 0, leftSum = 0;
        for (int i = 1; i < arr.length; i++)
            rightSum += arr[i];
        for (int i = 0, j = 1; j < arr.length; i++, j++) {
            rightSum -= arr[j];
            leftSum += arr[i];
            if (leftSum == rightSum)
                return arr[i + 1];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 9, 1, 3, 6, 4}; //checking method
        System.out.println( findElement( arr ) );
    }
}