package OH.OH_29_30;

public class ThrowException {
    public static void main(String[] args) {


        String str="";

        if(str.isEmpty()){

            System.out.println("Name can not be empty");
            System.err.println("Name can not be empty");
            throw new RuntimeException("Name can not be empty");

        }

    }
}