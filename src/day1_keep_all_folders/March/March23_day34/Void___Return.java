package day1_keep_all_folders.March.March23_day34;

public class Void___Return {
    public static void main(String[] args) {
        sayHello();
        //System.out.println(sayHello());//doesn't work
       // String msg = sayHello();//doesn't work
        sayBye();
        System.out.println(sayBye());
        String msg = sayBye();
        System.out.println(msg);
    }
    public static void sayHello(){
        System.out.println("Hello");

    }public static String sayBye(){
        return "Bye";
    }
}
