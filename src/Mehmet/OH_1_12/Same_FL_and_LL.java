package Mehmet.OH_1_12;

public class Same_FL_and_LL {
    public static void main(String[] args) {
        String[] names = {"Anna", "Mike", "Aliya", "Donald", "Saim", "Remus", "Mehmet", "Asya"};
        int count = 0;
        String max = names[0];
        for (int i = 0; i < names.length; i++) {
           names[i] = names[i].toLowerCase();
            char start = names[i].charAt(0);
            char end = names[i].charAt(names[i].length()-1);
            if(start==end){
                count++;

                if(names[i].length()>max.length()){
                    max=names[i];
                }
            }

        }
        System.out.println("count = " + count);
        System.out.println(max);

    }
}
