package day1_keep_all_folders.homework.Homework_April_13;

import java.util.Arrays;

public class solZombi {
    public static void main(String[] args) {
        //  Scanner input = new Scanner( System.in );
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
        int count = 0;
        boolean allZombie = true;
        int[] zombie = new int[inhabitants.length];
        System.out.println( "Day " + count + " " + Arrays.toString( inhabitants ) );

        do {
            allZombie = true;

            for (int i = 0; i < inhabitants.length; i++) {
                if (i == 0 && inhabitants[i + 1] == 0) {
                    zombie[i] = inhabitants[i] / 2;
                } else if (i != 0 && i != inhabitants.length - 1
                        && (inhabitants[i + 1] == 0 || inhabitants[i - 1] == 0)) {
                    zombie[i] = inhabitants[i] / 2;
                } else if (i != 0 && i == inhabitants.length - 1 && inhabitants[i - 1] == 0) {
                    zombie[i] = inhabitants[i] / 2;
                } else {
                    zombie[i] = inhabitants[i];
                }
            }

            for (int each : zombie) {
                if (each != 0) {
                    allZombie = false;
                    break;
                }
            }

            count++;
            System.out.println( "Day " + count + " " + Arrays.toString( zombie ) );

            if (allZombie) {
                System.out.println( "---- EXTINCT ----" );
            }

            System.arraycopy( zombie, 0, inhabitants, 0, zombie.length );

        } while (!allZombie);
    }
}

