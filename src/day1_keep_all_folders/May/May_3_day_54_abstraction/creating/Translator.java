package day1_keep_all_folders.May.May_3_day_54_abstraction.creating;

public class Translator {
    public static void main(String[] args) {
        //Language obj = new Language();//cannot create obj of interface
        Spanish sp = new Spanish();
        sp.hi();
        sp.bye();
        Turkish tur = new Turkish();
        tur.hi();
        tur.bye();
        //System.out.println(Language.Planet);todo read his code from may 3,2022.need to create planet class also.

    }
}
