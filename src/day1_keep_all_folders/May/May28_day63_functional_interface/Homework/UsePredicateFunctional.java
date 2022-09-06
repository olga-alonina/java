package day1_keep_all_folders.May.May28_day63_functional_interface.Homework;

public class UsePredicateFunctional {
    public static void main(String[] args) {
        PredicateFunctional<String, Boolean> contain_Duplicate_Digits = (number) -> {
            Boolean duplicate_Digits = false;
            String[] news = number.split( "" );
            Integer count = 0;
            for (int i = 0; i < news.length; i++) {
                for (int j = i + 1; j < news.length; j++) {
                    if (news[i].equals( news[j] )) {
                        count++;
                    }
                }
            }
            if (count > 0) {
                duplicate_Digits = true;
            }
            System.out.println( duplicate_Digits );
        };
        PredicateFunctional<String, Boolean> strong_Password = (password) -> {
            Boolean isStong = false;
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
                    if (password.length() >= 8 && !password.contains( " " )) {
                        isStong = true;
                    }
                }
            }
            System.out.println(isStong);
        };

        //examples
        contain_Duplicate_Digits.apply( "12314567" );
        strong_Password.apply( "lga1!" );
    }
}
