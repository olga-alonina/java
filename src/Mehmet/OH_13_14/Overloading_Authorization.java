package Mehmet.OH_13_14;

public class Overloading_Authorization {
    public static void main(String[] args) {

        boolean isLoginSuccess=login("Cydeo","Cydeo123");

        if(isLoginSuccess){
            System.out.println("Welcome to CYDEO");
        }else {
            System.err.println("Check your password");
        }

        System.out.println("====================");

        isLoginSuccess=login();

        if(isLoginSuccess){
            System.out.println("Welcome to CYDEO");
        }else {
            System.err.println("Check your password");
        }

    }

    public static boolean login(String username,String password){


        if(username.equalsIgnoreCase("cydeo") && password.equalsIgnoreCase("cydeo123")){
            return true;
        }
        return false;

    }

    public static boolean login(){

        String username=getUsername();
        String password=getPassword();

        if(username.equalsIgnoreCase("cydeo") && password.equalsIgnoreCase("cydeo123")){
            return true;
        }
        return false;

    }

    public static String getPassword() {

        // Assume that we get this infor from external file

        return "Cydeo123";
    }

    public static String getUsername() {
        // Assume that we get this infor from external file

        return "Cydeo";
    }

}

