package Team_task.Test;

public class Test8 {
    public static void main(String[] args) {
        String[][]arr={{"a","b","c"},{"d","e"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print( arr[i][j] + " " );
                if( arr[i][j].equals( "b")){
                    continue;
                }
            }
            continue;
        }
    }
}
