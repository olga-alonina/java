package Extra_Tasks;

public class QAO_Romanian_to_Arrabic {
    public static void main(String[] args) {
        /*I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000*/
        String givenNumber = "MCMXCIV";
        String givenNumber1 = "III";
        String givenNumber2 = "LVIII";
        String givenNumber3 = "LV";
        String givenNumber4 = "CXXV";

        CountRtoAr( givenNumber );
        CountRtoAr( givenNumber1 );
        CountRtoAr( givenNumber2 );
        CountRtoAr( givenNumber3 );
        CountRtoAr( givenNumber4 );

    }

    public static void CountRtoAr(String givenNumber) {
        int number = 0;
        int total = 0;
        for (int i = 0; i < givenNumber.length() - 1; i++) {
            number = 0;
            switch (givenNumber.charAt( i )) {
                case 'I':
                    if (givenNumber.charAt( i + 1 ) == 'V') {
                        number = 4;
                        total += number;
                        i++;
                    } else if (givenNumber.charAt( i + 1 ) == 'I') {
                        number = 1;
                        total += number;
                    } else if (givenNumber.charAt( i + 1 ) == 'X') {
                        number = 9;
                        total += number;
                        i++;
                    }
                    break;
                case 'X':
                    if (givenNumber.charAt( i + 1 ) == 'L') {
                        number = 40;
                        total += number;
                        i++;
                    } else if (givenNumber.charAt( i + 1 ) == 'C') {
                        number = 90;
                        total += number;
                        i++;
                    } else if (givenNumber.charAt( i + 1 ) == 'X') {
                        number = 20;
                        total += number;
                        i++;
                    }
                    break;
                case 'C':
                    if (givenNumber.charAt( i + 1 ) == 'D') {
                        number = 400;
                        total += number;
                        i++;
                    } else if (givenNumber.charAt( i + 1 ) == 'M') {
                        number = 900;
                        total += number;
                        i++;
                    } else if (givenNumber.charAt( i + 1 ) == 'C') {
                        number = 200;
                        total += number;
                        i++;
                    } else {
                        number = 100;
                        total += number;

                    }
                    break;
                case 'V':
                    number = 5;
                    total += number;
                    break;
                case 'L':
                    number = 50;
                    total += number;
                    break;
                case 'M':
                    number = 1000;
                    total += number;
                    break;
                case 'D':
                    number = 500;
                    total += number;

            }
            if (i == givenNumber.length() - 2) {
                if (givenNumber.charAt( i + 1 ) == 'I') {
                    total += 1;
                }
                if (givenNumber.charAt( i + 1 ) == 'V') {
                    total += 5;
                }
                if (givenNumber.charAt( i + 1 ) == 'X') {
                    total += 10;
                }
                if (givenNumber.charAt( i + 1 ) == 'C') {
                    total += 500;
                }
                if (givenNumber.charAt( i + 1 ) == 'M') {
                    total += 1000;
                }

            }

        }
        System.out.println( total );
    }
}
