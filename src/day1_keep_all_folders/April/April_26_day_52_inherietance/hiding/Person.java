package day1_keep_all_folders.April.April_26_day_52_inherietance.hiding;

public class Person {
    String name = "James Bond";

}
class SecretIdentity extends Person{
    String name = "Dnob Semaj";

}class  Runner{
    public static void main(String[] args) {
        Person per = new Person();
        System.out.println( per.name );
        SecretIdentity news = new SecretIdentity();
        System.out.println( news.name );
    }
}