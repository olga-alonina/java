package day1_keep_all_folders.March.March23_day34;

public class credit_Score {
    public static void main(String[] args) {
        get_Credit_Score();//is not used;
        int score = get_Credit_Score();
        System.out.println(score);
        System.out.println(get_Credit_Score());
        System.out.println(get_Credit_Score()+50);
        System.out.println(isGoodCreditScore(850));
        System.out.println(isGoodCreditScore(500));
    }
    public static int get_Credit_Score() {
    return 800;

    }public static boolean isGoodCreditScore(int creditScore){
        if(creditScore>=700) {
            return true;
        }else{
            return false;
        }
    }
}

