package Team_task.Vesa.VesaPackMay19;

public class Password_Validation_Task {
    /*Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space 1
2. Password should at least contain one upper case letter 2
3. Password should at least contain one lowercase letter 3
4. Password should at least contain one special characters 3
5. Password should at least contain a digit 3
6. if all requirements above are met, the method returns true, otherwise returns false
*/
    public static boolean password_Validation(String password) {
        int countUp = 0;
        int countLow = 0;
        int countDigit = 0;
        int countSpCharacters = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase( password.charAt( i ) )) {
                countLow++;
            } else if (Character.isUpperCase( password.charAt( i ) )) {
                countUp++;
            } else if (Character.isDigit( password.charAt( i ) )) {
                countDigit++;
            } else {
                countSpCharacters++;
            }
            if (countDigit >= 1 && countLow >= 1 && countUp >= 1 && countSpCharacters >= 1) {
                if (password.length() >= 6 && !password.contains( " " )) {
                    return true;
                }
            }
        }
        return false;
    }// Character.isSpaceChar


    public static void main(String[] args) {
        System.out.println( password_Validation( "Aa1@fjgjggjfjds" ) );//true
        System.out.println( password_Validation( "a1@fjgjggjfjds" ) );//false
        System.out.println( "****************" );
        System.out.println( password_Validation( "A1@AAAAAAAAAA" ) );//false
        System.out.println( password_Validation( "Aa@fjgjggjfjds" ) );//false
        System.out.println( "****************" );
        System.out.println( password_Validation( "Aa1fjgjggjfjds" ) );//false
        System.out.println( password_Validation( "Aa1@f" ) );//false
        System.out.println( password_Validation( "Aa1@ffff ffff" ) );//false
    }
}

