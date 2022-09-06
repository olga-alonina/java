package day1_keep_all_folders.April.April_19_day_49_Inheritance;

public class Building {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.name = "Alonina Olga";
        obj.age = 34;
        obj.hobby = "Reading books";
        obj.talk();

        SubPerson obj2 = new SubPerson();
        obj2.name = "Zayarny Daniel";
        obj2.age = 5;
        obj2.hobby = "Mess up with mother";

        obj2.fun_Level = 100;
        obj2.study();
    }
}
