package OH.OH_17_18;

public class CustomMan {
    public static void main(String[] args) {
        new lesson();
        System.out.println("*********");
        lesson a=new lesson();
        System.out.println( "a = " + a );
        System.out.println("*********");
        a.instance_Variable = "Instance Variable from main Method";
        System.out.println( "a = " + a );
        System.out.println("*********");
        a.instance_Method();
        System.out.println( "a = " + a );
        System.out.println("*********");
        lesson a2=new lesson();
        System.out.println( "a2 = " + a2 );
    }
}
