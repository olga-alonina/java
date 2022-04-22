package Mehmet.OH_1_12;

public class count_moving_to_mainFolder {
    public static void how_often_you_move(String[] str) {
        /*We have a record of every time a change of directory is performed.The different change directory functions are as follow ;

    				 ../  Move to parent folder of current folder
    				 ./   Remain in the same folder
    				 x/   Move to the child folder named x*/
        /*
		 Write a method to Find the minimum steps required to go back to main directory from current folder.
			The squence of operations performed after entering the main directory provided
    				 Input : {"x/","y/","../","z/","./"}
    				 Output : 2*/
        int count = 0;
        for (String parts : str) {
            if (parts.contains("../")) {
                count--;
            } else if (parts.contains("./")) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("************************\nother solution");
        String[] input = {"x/", "y/", "../", "z/", "./", "JavaProgramingB26/", "../"};
        minSteps(input);
    }

    public static void minSteps(String[] steps) {
        int count = 0;
        for (String eachStep : steps) {
            switch (eachStep) {
                case "./":
                    break;
                case "../":
                    count--;
                    break;
                default:
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String[] str = {"x/", "y/", "../", "z/", "./"};
        how_often_you_move(str);
    }
}
